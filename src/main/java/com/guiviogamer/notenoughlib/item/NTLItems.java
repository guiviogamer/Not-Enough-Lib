package com.guiviogamer.notenoughlib.item;

import com.guiviogamer.notenoughlib.NotEnoughLib;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class NTLItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NotEnoughLib.MOD_ID);

    // Ingots/Ores
    public static final DeferredItem<Item> ZINC_INGOT = ITEMS.register("zinc_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZINC_NUGGET = ITEMS.register("zinc_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_ZINC = ITEMS.register("raw_zinc",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRASS_INGOT = ITEMS.register("brass_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ELECTRUM_INGOT = ITEMS.register("electrum_ingot",
            () -> new Item(new Item.Properties()));
    // Dusts
    public static final DeferredItem<Item> ZINC_DUST = ITEMS.register("zinc_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRON_DUST = ITEMS.register("iron_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOLD_DUST = ITEMS.register("gold_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_DUST = ITEMS.register("copper_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_DUST = ITEMS.register("diamond_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CARBON_DUST = ITEMS.register("carbon_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_DUST = ITEMS.register("steel_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRASS_DUST = ITEMS.register("brass_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ELECTRUM_DUST = ITEMS.register("electrum_dust",
            () -> new Item(new Item.Properties()));
    // Foods
    public static final DeferredItem<Item> BAGUETTE = ITEMS.register("baguette",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BAGUETTE)));
    // Other Resources
    public static final DeferredItem<Item> CARDBOARD_PULP = ITEMS.register("cardboard_pulp",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CARDBOARD = ITEMS.register("cardboard",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
