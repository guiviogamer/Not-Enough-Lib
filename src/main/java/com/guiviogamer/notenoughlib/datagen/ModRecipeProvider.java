package com.guiviogamer.notenoughlib.datagen;

import com.guiviogamer.notenoughlib.NotEnoughLib;
import com.guiviogamer.notenoughlib.block.NTLBlocks;
import com.guiviogamer.notenoughlib.item.NTLItems;
import com.guiviogamer.notenoughlib.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        List<ItemLike> ZINC_SMELTABLES = List.of(NTLItems.RAW_ZINC,
                NTLItems.ZINC_DUST, NTLBlocks.ZINC_ORE, NTLBlocks.ZINC_DEEPSLATE_ORE);
        List<ItemLike> IRON_SMELTABLES = List.of(NTLItems.IRON_DUST);
        List<ItemLike> GOLD_SMELTABLES = List.of(NTLItems.GOLD_DUST);
        List<ItemLike> COPPER_SMELTABLES = List.of(NTLItems.COPPER_DUST);
        List<ItemLike> DIAMOND_SMELTABLES = List.of(NTLItems.DIAMOND_DUST);
        List<ItemLike> STEEL_SMELTABLES = List.of(NTLItems.STEEL_DUST);
        List<ItemLike> BRASS_SMELTABLES = List.of(NTLItems.BRASS_DUST);
        List<ItemLike> ELECTRUM_SMELTABLES = List.of(NTLItems.ELECTRUM_DUST);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, NTLBlocks.ZINC_BLOCK.get())
                .pattern("ZZZ")
                .pattern("ZZZ")
                .pattern("ZZZ")
                .define('Z', NTLItems.ZINC_INGOT.get())
                .unlockedBy("has_zinc_ingot", has(NTLItems.ZINC_INGOT))
                .save(recipeOutput, "zinc_block_from_zinc_ingots");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NTLItems.ZINC_INGOT.get(), 9)
                .requires(NTLBlocks.ZINC_BLOCK)
                .unlockedBy("has_zinc_block", has(NTLBlocks.ZINC_BLOCK))
                .save(recipeOutput, "zinc_ingots_from_zinc_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, NTLItems.ZINC_INGOT.get())
                .pattern("ZZZ")
                .pattern("ZZZ")
                .pattern("ZZZ")
                .define('Z', NTLItems.ZINC_NUGGET.get())
                .unlockedBy("has_zinc_nugget", has(NTLItems.ZINC_NUGGET))
                .save(recipeOutput, "zinc_ingot_from_zinc_nuggets");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NTLItems.ZINC_NUGGET.get(), 9)
                .requires(NTLItems.ZINC_INGOT)
                .unlockedBy("has_zinc_ingot", has(NTLItems.ZINC_INGOT))
                .save(recipeOutput, "zinc_nuggets_from_zinc_ingot");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, NTLItems.STEEL_INGOT.get())
                .pattern("II")
                .pattern("CC")
                .define('I', Items.IRON_INGOT)
                .define('C', ItemTags.COALS)
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .unlockedBy("has_coal", has(ItemTags.COALS))
                .save(recipeOutput, "steel_ingot_from_iron_ingot_and_coal");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, NTLItems.STEEL_DUST.get(), 2)
                .pattern("IC")
                .pattern("CC")
                .define('I', ModTags.Items.IRON_DUSTS)
                .define('C', ModTags.Items.COAL_DUSTS)
                .unlockedBy("has_iron_dust", has(ModTags.Items.IRON_DUSTS))
                .unlockedBy("has_carbon_dust", has(ModTags.Items.COAL_DUSTS))
                .save(recipeOutput, "steel_dust_from_iron_and_carbon_dusts");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, NTLItems.BRASS_INGOT.get(), 2)
                .pattern("ZZ")
                .pattern("CC")
                .define('Z', ModTags.Items.ZINC_INGOTS)
                .define('C', Items.COPPER_INGOT)
                .unlockedBy("has_zinc_ingot", has(ModTags.Items.ZINC_INGOTS))
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT))
                .save(recipeOutput, "brass_ingot_from_zinc_and_copper_ingots");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, NTLItems.BRASS_DUST.get(), 3)
                .pattern("ZC")
                .pattern("CC")
                .define('Z', ModTags.Items.ZINC_DUSTS)
                .define('C', ModTags.Items.COPPER_DUSTS)
                .unlockedBy("has_zinc_dust", has(ModTags.Items.ZINC_DUSTS))
                .unlockedBy("has_copper_dust", has(ModTags.Items.COPPER_DUSTS))
                .save(recipeOutput, "brass_dust_from_zinc_and_copper_dusts");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, NTLItems.ELECTRUM_INGOT.get(), 2)
                .pattern("GG")
                .pattern("RR")
                .define('G', Items.GOLD_INGOT)
                .define('R', Items.REDSTONE)
                .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
                .unlockedBy("has_redstone", has(Items.REDSTONE))
                .save(recipeOutput, "electrum_ingot_from_gold_ingot_and_redstone");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, NTLItems.ELECTRUM_DUST.get(), 3)
                .pattern("GR")
                .pattern("RR")
                .define('G', ModTags.Items.GOLD_DUSTS)
                .define('R', Items.REDSTONE)
                .unlockedBy("has_gold_dust", has(ModTags.Items.GOLD_DUSTS))
                .unlockedBy("has_redstone", has(Items.REDSTONE))
                .save(recipeOutput, "electrum_dust_from_gold_dust_and_redstone");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, NTLItems.BAGUETTE.get())
                .pattern("  B")
                .pattern(" B ")
                .pattern("B  ")
                .define('B', Items.BREAD)
                .unlockedBy("has_bread", has(Items.BREAD))
                .save(recipeOutput, "baguette_from_bread");

        // Smelting
        oreSmelting(recipeOutput, ZINC_SMELTABLES, RecipeCategory.MISC, NTLItems.ZINC_INGOT.get(), 0.25f, 200, "zinc_ingot");
        oreSmelting(recipeOutput, IRON_SMELTABLES, RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 200, "iron_ingot");
        oreSmelting(recipeOutput, GOLD_SMELTABLES, RecipeCategory.MISC, Items.GOLD_INGOT, 0.25f, 200, "gold_ingot");
        oreSmelting(recipeOutput, COPPER_SMELTABLES, RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 200, "copper_ingot");
        oreSmelting(recipeOutput, DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND, 0.25f, 200, "diamond");
        oreSmelting(recipeOutput, STEEL_SMELTABLES, RecipeCategory.MISC, NTLItems.STEEL_INGOT, 0.25f, 200, "steel_ingot");
        oreSmelting(recipeOutput, BRASS_SMELTABLES, RecipeCategory.MISC, NTLItems.BRASS_INGOT, 0.25f, 200, "brass_ingot");
        oreSmelting(recipeOutput, ELECTRUM_SMELTABLES, RecipeCategory.MISC, NTLItems.ELECTRUM_INGOT, 0.25f, 200, "electrum_ingot");

        // Blasting
        oreBlasting(recipeOutput, ZINC_SMELTABLES, RecipeCategory.MISC, NTLItems.ZINC_INGOT.get(), 0.25f, 100, "zinc_ingot");
        oreBlasting(recipeOutput, IRON_SMELTABLES, RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 100, "iron_ingot");
        oreBlasting(recipeOutput, GOLD_SMELTABLES, RecipeCategory.MISC, Items.GOLD_INGOT, 0.25f, 100, "gold_ingot");
        oreBlasting(recipeOutput, COPPER_SMELTABLES, RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 100, "copper_ingot");
        oreBlasting(recipeOutput, DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND, 0.25f, 100, "diamond");
        oreBlasting(recipeOutput, STEEL_SMELTABLES, RecipeCategory.MISC, NTLItems.STEEL_INGOT, 0.25f, 100, "steel_ingot");
        oreBlasting(recipeOutput, BRASS_SMELTABLES, RecipeCategory.MISC, NTLItems.BRASS_INGOT, 0.25f, 100, "brass_ingot");
        oreBlasting(recipeOutput, ELECTRUM_SMELTABLES, RecipeCategory.MISC, NTLItems.ELECTRUM_INGOT, 0.25f, 100, "electrum_ingot");
    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, NotEnoughLib.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}