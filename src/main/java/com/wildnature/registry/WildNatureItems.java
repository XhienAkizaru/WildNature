package com.wildnature.registry;

import com.wildnature.WildNature;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

public final class WildNatureItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(WildNature.MOD_ID);
    public static final DeferredItem<BlockItem> TWIG_PILE = ITEMS.register("twig_pile", () -> new BlockItem(WildNatureBlocks.TWIG_PILE.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> SMALL_PEBBLES = ITEMS.register("small_pebbles", () -> new BlockItem(WildNatureBlocks.SMALL_PEBBLES.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> FALLEN_LEAVES = ITEMS.register("fallen_leaves", () -> new BlockItem(WildNatureBlocks.FALLEN_LEAVES.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> FOREST_DEBRIS = ITEMS.register("forest_debris", () -> new BlockItem(WildNatureBlocks.FOREST_DEBRIS.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> PINECONES = ITEMS.register("pinecones", () -> new BlockItem(WildNatureBlocks.PINECONES.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> MOSS_PATCH = ITEMS.register("moss_patch", () -> new BlockItem(WildNatureBlocks.MOSS_PATCH.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> WILD_GRASS = ITEMS.register("wild_grass", () -> new BlockItem(WildNatureBlocks.WILD_GRASS.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> FALLEN_BRANCH = ITEMS.register("fallen_branch", () -> new BlockItem(WildNatureBlocks.FALLEN_BRANCH.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> MUSHROOMS_CLUSTER = ITEMS.register("mushrooms_cluster", () -> new BlockItem(WildNatureBlocks.MUSHROOMS_CLUSTER.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> WILDFLOWERS = ITEMS.register("wildflowers", () -> new BlockItem(WildNatureBlocks.WILDFLOWERS.get(), new Item.Properties()));

    private WildNatureItems() {}
}
