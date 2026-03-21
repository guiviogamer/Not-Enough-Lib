package com.guiviogamer.notenoughlib.item;

import com.guiviogamer.notenoughlib.NotEnoughLib;
import com.guiviogamer.notenoughlib.block.ModBlocks;
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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ZINC_ORE.get()))
                    .title(Component.translatable("creativetab.notenoughlib.resources_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        // Zinc
                        output.accept(ModBlocks.ZINC_DEEPSLATE_ORE);
                        output.accept(ModBlocks.ZINC_ORE);
                        output.accept(ModBlocks.ZINC_BLOCK);
                        output.accept(ModItems.ZINC_INGOT);
                        output.accept(ModItems.ZINC_NUGGET);
                        output.accept(ModItems.RAW_ZINC);
                        output.accept(ModItems.ZINC_DUST);

                        // Steel
                        output.accept(ModItems.STEEL_INGOT);
                        output.accept(ModItems.STEEL_DUST);

                        // Brass
                        output.accept(ModItems.BRASS_INGOT);
                        output.accept(ModItems.BRASS_DUST);

                        // Electrum
                        output.accept(ModItems.ELECTRUM_INGOT);
                        output.accept(ModItems.ELECTRUM_DUST);

                        // Vanilla dusts
                        output.accept(ModItems.IRON_DUST);
                        output.accept(ModItems.GOLD_DUST);
                        output.accept(ModItems.COPPER_DUST);
                        output.accept(ModItems.DIAMOND_DUST);
                        output.accept(ModItems.CARBON_DUST);

                        // Foods
                        output.accept(ModItems.BAGUETTE);

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
