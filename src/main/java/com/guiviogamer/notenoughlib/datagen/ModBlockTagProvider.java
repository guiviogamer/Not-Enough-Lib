package com.guiviogamer.notenoughlib.datagen;

import com.guiviogamer.notenoughlib.NotEnoughLib;
import com.guiviogamer.notenoughlib.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, NotEnoughLib.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.ZINC_BLOCK.get())
        /*        .add(ModBlocks.ZINC_ORE.get())
                .add(ModBlocks.ZINC_DEEPSLATE_ORE.get()) */ ;

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ZINC_BLOCK.get())
        /*        .add(ModBlocks.ZINC_ORE.get())
                .add(ModBlocks.ZINC_DEEPSLATE_ORE.get()) */ ;
    }
}