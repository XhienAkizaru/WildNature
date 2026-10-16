# WildNature 1.0.0 — proyecto fuente

Mod decorativo para Minecraft Java 26.3 + NeoForge 26.3.0.86 (objetivo Java 25). Contiene diez bloques decorativos, modelos, texturas, traducciones y recursos de generación natural por bioma.

## Estado actual

Este paquete NO es un JAR instalable. Los recursos se han validado estructuralmente, pero la compilación y la prueba dentro de Minecraft no se han podido ejecutar en el entorno de creación. Consulta `BUILD_STATUS.txt` para el estado exacto y las limitaciones.

## Requisitos para compilar

- JDK 25 x64
- Gradle compatible con el plugin NeoGradle definido en `build.gradle`
- Acceso a internet para resolver las dependencias Maven de NeoForge
- Python 3 para ejecutar el validador de recursos (opcional, pero recomendado)

## Pasos en Windows

1. Instala JDK 25 x64 y Gradle.
2. Comprueba `java -version` y `gradle --version`.
3. Abre una terminal en la carpeta raíz del proyecto.
4. Ejecuta `python scripts\\validate_assets.py`.
5. Ejecuta `build_windows.bat`.
6. Solo si Gradle termina con `BUILD SUCCESSFUL`, busca el JAR en `build\\libs\\`.
7. Prueba en una instancia separada de Minecraft 26.3 + NeoForge 26.3.0.86 y en un mundo nuevo. Haz copia de seguridad antes de probar.

## Contenido incluido

- Ramitas, piedras pequeñas, hojas caídas, restos de bosque, piñas, musgo, hierba silvestre, ramas caídas, setas y flores.
- Modelos, texturas, blockstates, modelos de inventario y traducciones español/inglés.
- Recursos de worldgen y biome modifiers para intentar añadir decoración a biomas compatibles.
- Validador offline de recursos y workflow de GitHub Actions para compilar en un entorno con acceso a internet.

## Aún no implementado/verificado

Configuración de densidad en runtime, sonidos ambientales, efectos de lluvia/nieve, árboles naturales nuevos, recogida automática, persistencia probada, compilación y prueba dentro del juego. No se deben considerar funciones terminadas hasta implementarlas y verificarlas.
