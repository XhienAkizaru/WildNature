package com.wildnature.registry;

import com.wildnature.WildNature;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

public final class WildNatureItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(WildNature.MOD_ID);
    public static final DeferredItem<BlockItem> TWIG_PILE = ITEMS.register("twig_pile", () -> new BlockItem(WildNatureBlocks.TWIG_PILE.get(), itemProperties("twig_pile")));
    public static final DeferredItem<BlockItem> SMALL_PEBBLES = ITEMS.register("small_pebbles", () -> new BlockItem(WildNatureBlocks.SMALL_PEBBLES.get(), itemProperties("small_pebbles")));
    public static final DeferredItem<BlockItem> FALLEN_LEAVES = ITEMS.register("fallen_leaves", () -> new BlockItem(WildNatureBlocks.FALLEN_LEAVES.get(), itemProperties("fallen_leaves")));
    public static final DeferredItem<BlockItem> FOREST_DEBRIS = ITEMS.register("forest_debris", () -> new BlockItem(WildNatureBlocks.FOREST_DEBRIS.get(), itemProperties("forest_debris")));
    public static final DeferredItem<BlockItem> PINECONES = ITEMS.register("pinecones", () -> new BlockItem(WildNatureBlocks.PINECONES.get(), itemProperties("pinecones")));
    public static final DeferredItem<BlockItem> MOSS_PATCH = ITEMS.register("moss_patch", () -> new BlockItem(WildNatureBlocks.MOSS_PATCH.get(), itemProperties("moss_patch")));
    public static final DeferredItem<BlockItem> WILD_GRASS = ITEMS.register("wild_grass", () -> new BlockItem(WildNatureBlocks.WILD_GRASS.get(), itemProperties("wild_grass")));
    public static final DeferredItem<BlockItem> FALLEN_BRANCH = ITEMS.register("fallen_branch", () -> new BlockItem(WildNatureBlocks.FALLEN_BRANCH.get(), itemProperties("fallen_branch")));
    public static final DeferredItem<BlockItem> MUSHROOMS_CLUSTER = ITEMS.register("mushrooms_cluster", () -> new BlockItem(WildNatureBlocks.MUSHROOMS_CLUSTER.get(), itemProperties("mushrooms_cluster")));
    public static final DeferredItem<BlockItem> WILDFLOWERS = ITEMS.register("wildflowers", () -> new BlockItem(WildNatureBlocks.WILDFLOWERS.get(), itemProperties("wildflowers")));

    private static Item.Properties itemProperties(String name) {
        return new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(WildNature.MOD_ID, name))).useBlockDescriptionPrefix();
    }

    private WildNatureItems() {}
}
