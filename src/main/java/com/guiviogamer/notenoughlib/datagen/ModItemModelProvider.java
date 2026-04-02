package com.guiviogamer.notenoughlib.datagen;

import com.guiviogamer.notenoughlib.NotEnoughLib;
import com.guiviogamer.notenoughlib.item.NTLItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, NotEnoughLib.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(NTLItems.ZINC_INGOT.get());
        basicItem(NTLItems.RAW_ZINC.get());
        basicItem(NTLItems.ZINC_NUGGET.get());
        basicItem(NTLItems.ZINC_DUST.get());

        basicItem(NTLItems.STEEL_INGOT.get());
        basicItem(NTLItems.STEEL_DUST.get());

        basicItem(NTLItems.BRASS_INGOT.get());
        basicItem(NTLItems.BRASS_DUST.get());

        basicItem(NTLItems.ELECTRUM_INGOT.get());
        basicItem(NTLItems.ELECTRUM_DUST.get());

        basicItem(NTLItems.IRON_DUST.get());
        basicItem(NTLItems.GOLD_DUST.get());
        basicItem(NTLItems.COPPER_DUST.get());
        basicItem(NTLItems.DIAMOND_DUST.get());
        basicItem(NTLItems.CARBON_DUST.get());

        handheldItem(NTLItems.BAGUETTE.get());
    }
}
