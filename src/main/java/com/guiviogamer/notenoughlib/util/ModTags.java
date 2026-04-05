package com.guiviogamer.notenoughlib.util;

import com.guiviogamer.notenoughlib.NotEnoughLib;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        private static final String ntlId = NotEnoughLib.MOD_ID;
        private static final String neoForgeCommon = "c";

        private static TagKey<Block> createTag(String modid, String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(modid, name));
        }
    }

    public static class Items {
        private static final String ntlId = NotEnoughLib.MOD_ID;
        private static final String neoForgeCommon = "c";

        public static final TagKey<Item> ZINC_INGOTS = createTag(neoForgeCommon, "ingots/zinc");
        public static final TagKey<Item> ZINC_DUSTS = createTag(neoForgeCommon, "dusts/zinc");
        public static final TagKey<Item> STEEL_INGOTS = createTag(neoForgeCommon, "ingots/steel");
        public static final TagKey<Item> STEEL_DUSTS = createTag(neoForgeCommon, "dusts/steel");
        public static final TagKey<Item> BRASS_INGOTS = createTag(neoForgeCommon, "ingots/brass");
        public static final TagKey<Item> BRASS_DUSTS = createTag(neoForgeCommon, "dusts/brass");
        public static final TagKey<Item> ELECTRUM_INGOTS = createTag(neoForgeCommon, "ingots/electrum");
        public static final TagKey<Item> ELECTRUM_DUSTS = createTag(neoForgeCommon, "dusts/electrum");
        public static final TagKey<Item> IRON_DUSTS = createTag(neoForgeCommon, "dusts/iron");
        public static final TagKey<Item> GOLD_DUSTS = createTag(neoForgeCommon, "dusts/gold");
        public static final TagKey<Item> COPPER_DUSTS = createTag(neoForgeCommon, "dusts/copper");
        public static final TagKey<Item> DIAMOND_DUSTS = createTag(neoForgeCommon, "dusts/diamond");
        public static final TagKey<Item> COAL_DUSTS = createTag(neoForgeCommon, "dusts/coal");
        public static final TagKey<Item> CARDBOARD = createTag(neoForgeCommon, "cardboard");

        private static TagKey<Item> createTag(String modid, String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(modid, name));
        }
    }
}
