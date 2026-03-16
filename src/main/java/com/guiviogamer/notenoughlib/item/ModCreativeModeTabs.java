package com.guiviogamer.notenoughlib.item;

import com.guiviogamer.notenoughlib.NotEnoughLib;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NotEnoughLib.MOD_ID);

    public static final Supplier<CreativeModeTab> RESOURCES_TAB = CREATIVE_MODE_TAB.register("resources_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ZINC_INGOT.get()))
                    .title(Component.translatable("creativetab.notenoughlib.resources_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ZINC_INGOT);
                        output.accept(ModItems.RAW_ZINC);
                        output.accept(ModItems.CRUSHED_ZINC);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
