package com.guiviogamer.notenoughlib.datagen;

import com.guiviogamer.notenoughlib.NotEnoughLib;
import com.guiviogamer.notenoughlib.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, NotEnoughLib.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.ZINC_INGOT.get());
        basicItem(ModItems.RAW_ZINC.get());
        basicItem(ModItems.ZINC_NUGGET.get());
        basicItem(ModItems.ZINC_DUST.get());

        basicItem(ModItems.STEEL_INGOT.get());
        basicItem(ModItems.STEEL_DUST.get());

        basicItem(ModItems.BRASS_INGOT.get());
        basicItem(ModItems.BRASS_DUST.get());

        basicItem(ModItems.ELECTRUM_INGOT.get());
        basicItem(ModItems.ELECTRUM_DUST.get());

        basicItem(ModItems.IRON_DUST.get());
        basicItem(ModItems.GOLD_DUST.get());
        basicItem(ModItems.COPPER_DUST.get());
        basicItem(ModItems.DIAMOND_DUST.get());
        basicItem(ModItems.CARBON_DUST.get());

        basicItem(ModItems.BAGUETTE.get());
    }
}
