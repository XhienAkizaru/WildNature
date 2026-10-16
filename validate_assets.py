#!/usr/bin/env python3
"""Offline structural checks for WildNature assets and data-driven worldgen.

This script does not replace Gradle compilation or an in-game smoke test.
"""
import json
import re
import sys
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]
RES = ROOT / 'src' / 'main' / 'resources'
ASSETS = RES / 'assets' / 'wildnature'
DATA = RES / 'data' / 'wildnature'
IDS = [
    'twig_pile', 'small_pebbles', 'fallen_leaves', 'forest_debris', 'pinecones',
    'moss_patch', 'wild_grass', 'fallen_branch', 'mushrooms_cluster', 'wildflowers'
]
errors = []
json_count = 0
parsed = {}
for path in RES.rglob('*.json'):
    try:
        parsed[path] = json.loads(path.read_text(encoding='utf-8'))
        json_count += 1
    except Exception as exc:
        errors.append(f'Invalid JSON {path.relative_to(ROOT)}: {exc}')

for path, data in parsed.items():
    if '/models/' in path.as_posix():
        raw = path.read_text(encoding='utf-8')
        for texture in re.findall(r'"(?:all|particle|side|top|bottom|end|cross|texture)"\s*:\s*"wildnature:([^\"]+)"', raw):
            texture_path = ASSETS / 'textures' / (texture + '.png')
            if not texture_path.is_file():
                errors.append(f'Missing texture {texture_path.relative_to(ROOT)} referenced by {path.relative_to(ROOT)}')

for name in IDS:
    required = [
        ASSETS / 'blockstates' / f'{name}.json',
        ASSETS / 'models' / 'block' / f'{name}.json',
        ASSETS / 'models' / 'item' / f'{name}.json',
        ASSETS / 'textures' / 'block' / f'{name}.png',
        DATA / 'worldgen' / 'configured_feature' / f'{name}.json',
        DATA / 'worldgen' / 'placed_feature' / f'{name}.json',
        DATA / 'neoforge' / 'biome_modifier' / f'add_{name}.json',
    ]
    for path in required:
        if not path.is_file():
            errors.append(f'Missing required resource: {path.relative_to(ROOT)}')

# Verify every biome modifier points to an existing placed feature, and every
# placed feature points to an existing configured feature.
for path in (DATA / 'neoforge' / 'biome_modifier').glob('*.json'):
    data = parsed.get(path, {})
    feature_ids = data.get('features', [])
    if isinstance(feature_ids, str): feature_ids = [feature_ids]
    for feature_id in feature_ids:
        if feature_id.startswith('wildnature:'):
            target = DATA / 'worldgen' / 'placed_feature' / (feature_id.split(':',1)[1] + '.json')
            if not target.is_file(): errors.append(f'{path.relative_to(ROOT)} points to missing placed feature {feature_id}')

for path in (DATA / 'worldgen' / 'placed_feature').glob('*.json'):
    data = parsed.get(path, {})
    feature_id = data.get('feature')
    if isinstance(feature_id, str) and feature_id.startswith('wildnature:'):
        target = DATA / 'worldgen' / 'configured_feature' / (feature_id.split(':',1)[1] + '.json')
        if not target.is_file(): errors.append(f'{path.relative_to(ROOT)} points to missing configured feature {feature_id}')

for lang in ('en_us', 'es_es'):
    path = ASSETS / 'lang' / f'{lang}.json'
    if not path.is_file(): errors.append(f'Missing language file: {path.relative_to(ROOT)}')

if errors:
    print('\n'.join('ERROR: ' + e for e in errors))
    sys.exit(1)
print(f'PASS: {json_count} JSON files parsed; {len(IDS)} decorative resource sets and worldgen links found; referenced textures exist.')
print('LIMITATION: structural validation only; Java compilation and Minecraft launch still need to be run.')
