package com.guiviogamer.notenoughlib.item;

import com.guiviogamer.notenoughlib.NotEnoughLib;
import com.guiviogamer.notenoughlib.block.NTLBlocks;
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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(NTLBlocks.ZINC_ORE.get()))
                    .title(Component.translatable("creativetab.notenoughlib.resources_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        // Zinc
                        output.accept(NTLBlocks.ZINC_DEEPSLATE_ORE);
                        output.accept(NTLBlocks.ZINC_ORE);
                        output.accept(NTLBlocks.ZINC_BLOCK);
                        output.accept(NTLItems.ZINC_INGOT);
                        output.accept(NTLItems.ZINC_NUGGET);
                        output.accept(NTLItems.RAW_ZINC);
                        output.accept(NTLItems.ZINC_DUST);

                        // Steel
                        output.accept(NTLItems.STEEL_INGOT);
                        output.accept(NTLItems.STEEL_DUST);

                        // Brass
                        output.accept(NTLItems.BRASS_INGOT);
                        output.accept(NTLItems.BRASS_DUST);

                        // Electrum
                        output.accept(NTLItems.ELECTRUM_INGOT);
                        output.accept(NTLItems.ELECTRUM_DUST);

                        // Vanilla dusts
                        output.accept(NTLItems.IRON_DUST);
                        output.accept(NTLItems.GOLD_DUST);
                        output.accept(NTLItems.COPPER_DUST);
                        output.accept(NTLItems.DIAMOND_DUST);
                        output.accept(NTLItems.CARBON_DUST);

                        // Foods
                        output.accept(NTLItems.BAGUETTE);

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
