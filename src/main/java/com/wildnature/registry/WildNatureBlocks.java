package com.wildnature.registry;

import com.wildnature.WildNature;
import com.wildnature.block.SmallPebblesBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

public final class WildNatureBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(WildNature.MOD_ID);
    public static final DeferredBlock<Block> TWIG_PILE = BLOCKS.register("twig_pile", () -> new Block(BlockBehaviour.Properties.of().setId(blockKey("twig_pile")).noOcclusion().instabreak().strength(0.05F).sound(SoundType.WOOD)));
    public static final DeferredBlock<SmallPebblesBlock> SMALL_PEBBLES = BLOCKS.register("small_pebbles", () -> new SmallPebblesBlock(BlockBehaviour.Properties.of().setId(blockKey("small_pebbles")).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> FALLEN_LEAVES = BLOCKS.register("fallen_leaves", () -> new Block(BlockBehaviour.Properties.of().setId(blockKey("fallen_leaves")).noOcclusion().instabreak().strength(0.05F).sound(SoundType.GRASS)));
    public static final DeferredBlock<Block> FOREST_DEBRIS = BLOCKS.register("forest_debris", () -> new Block(BlockBehaviour.Properties.of().setId(blockKey("forest_debris")).noOcclusion().instabreak().strength(0.05F).sound(SoundType.GRASS)));
    public static final DeferredBlock<Block> PINECONES = BLOCKS.register("pinecones", () -> new Block(BlockBehaviour.Properties.of().setId(blockKey("pinecones")).noOcclusion().instabreak().strength(0.05F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> MOSS_PATCH = BLOCKS.register("moss_patch", () -> new Block(BlockBehaviour.Properties.of().setId(blockKey("moss_patch")).noOcclusion().instabreak().strength(0.05F).sound(SoundType.GRASS)));
    public static final DeferredBlock<Block> WILD_GRASS = BLOCKS.register("wild_grass", () -> new Block(BlockBehaviour.Properties.of().setId(blockKey("wild_grass")).noOcclusion().instabreak().strength(0.05F).sound(SoundType.GRASS)));
    public static final DeferredBlock<Block> FALLEN_BRANCH = BLOCKS.register("fallen_branch", () -> new Block(BlockBehaviour.Properties.of().setId(blockKey("fallen_branch")).noOcclusion().instabreak().strength(0.05F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> MUSHROOMS_CLUSTER = BLOCKS.register("mushrooms_cluster", () -> new Block(BlockBehaviour.Properties.of().setId(blockKey("mushrooms_cluster")).noOcclusion().instabreak().strength(0.05F).sound(SoundType.GRASS)));
    public static final DeferredBlock<Block> WILDFLOWERS = BLOCKS.register("wildflowers", () -> new Block(BlockBehaviour.Properties.of().setId(blockKey("wildflowers")).noOcclusion().instabreak().strength(0.05F).sound(SoundType.GRASS)));

    private static ResourceKey<Block> blockKey(String name) {
        return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(WildNature.MOD_ID, name));
    }

    private WildNatureBlocks() {}
}
