package com.guiviogamer.notenoughlib;

import com.guiviogamer.notenoughlib.block.NTLBlocks;
import com.guiviogamer.notenoughlib.item.ModCreativeModeTabs;
import com.guiviogamer.notenoughlib.item.NTLItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(NotEnoughLib.MOD_ID)
public class NotEnoughLib {
    public static final String MOD_ID = "notenoughlib";
    public static final Logger LOGGER = LogUtils.getLogger();

    public NotEnoughLib(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        NTLItems.register(modEventBus);
        NTLBlocks.register(modEventBus);
        ModCreativeModeTabs.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("HELLO FROM NTL COMMON SETUP");
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("HELLO from NTL server starting");
    }

    @EventBusSubscriber(modid = NotEnoughLib.MOD_ID, value = Dist.CLIENT)
    static class ClientModEvents {
        @SubscribeEvent
        static void onClientSetup(FMLClientSetupEvent event) {
            LOGGER.info("HELLO FROM NTL CLIENT SETUP");
        }
    }
}
