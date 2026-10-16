package com.wildnature;

import com.mojang.logging.LogUtils;
import com.wildnature.registry.WildNatureBlocks;
import com.wildnature.registry.WildNatureItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(WildNature.MOD_ID)
public final class WildNature {
    public static final String MOD_ID = "wildnature";
    public static final Logger LOGGER = LogUtils.getLogger();

    public WildNature(IEventBus modEventBus) {
        WildNatureBlocks.BLOCKS.register(modEventBus);
        WildNatureItems.ITEMS.register(modEventBus);
        modEventBus.addListener(WildNature::addCreativeItems);
        LOGGER.info("WildNature 1.0 initial decorative blocks registered.");
    }

    private static void addCreativeItems(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS || event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            event.accept(WildNatureItems.TWIG_PILE);
            event.accept(WildNatureItems.SMALL_PEBBLES);
            event.accept(WildNatureItems.FALLEN_LEAVES);
            event.accept(WildNatureItems.FOREST_DEBRIS);
            event.accept(WildNatureItems.PINECONES);
            event.accept(WildNatureItems.MOSS_PATCH);
            event.accept(WildNatureItems.WILD_GRASS);
            event.accept(WildNatureItems.FALLEN_BRANCH);
            event.accept(WildNatureItems.MUSHROOMS_CLUSTER);
            event.accept(WildNatureItems.WILDFLOWERS);
        }
    }
}
