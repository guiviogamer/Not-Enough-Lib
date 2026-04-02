package com.guiviogamer.notenoughlib.datagen;

import com.guiviogamer.notenoughlib.NotEnoughLib;
import com.guiviogamer.notenoughlib.item.NTLItems;
import com.guiviogamer.notenoughlib.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, NotEnoughLib.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        /* tag(ModTags.Items.TRANSFORMABLE_ITEMS) // EXAMPLE TAG. NOT REAL!!!
                .add(ModItems.BISMUTH.get())
                .add(ModItems.RAW_BISMUTH.get())
                .add(Items.COAL)
                .add(Items.STICK)
                .add(Items.COMPASS);
         */
        tag(ModTags.Items.ZINC_INGOTS)
                .add(NTLItems.ZINC_INGOT.get());
        tag(ModTags.Items.ZINC_DUSTS)
                .add(NTLItems.ZINC_DUST.get());
        tag(ModTags.Items.STEEL_INGOTS)
                .add(NTLItems.STEEL_INGOT.get());
        tag(ModTags.Items.STEEL_DUSTS)
                .add(NTLItems.STEEL_DUST.get());
        tag(ModTags.Items.BRASS_INGOTS)
                .add(NTLItems.BRASS_INGOT.get());
        tag(ModTags.Items.BRASS_DUSTS)
                .add(NTLItems.BRASS_DUST.get());
        tag(ModTags.Items.ELECTRUM_INGOTS)
                .add(NTLItems.ELECTRUM_INGOT.get());
        tag(ModTags.Items.ELECTRUM_DUSTS)
                .add(NTLItems.ELECTRUM_DUST.get());
        tag(ModTags.Items.IRON_DUSTS)
                .add(NTLItems.IRON_DUST.get());
        tag(ModTags.Items.GOLD_DUSTS)
                .add(NTLItems.GOLD_DUST.get());
        tag(ModTags.Items.COPPER_DUSTS)
                .add(NTLItems.COPPER_DUST.get());
        tag(ModTags.Items.DIAMOND_DUSTS)
                .add(NTLItems.DIAMOND_DUST.get());
        tag(ModTags.Items.COAL_DUSTS)
                .add(NTLItems.CARBON_DUST.get());
    }
}