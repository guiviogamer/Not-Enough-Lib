package com.guiviogamer.notenoughlib.item;

import com.guiviogamer.notenoughlib.NotEnoughLib;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NotEnoughLib.MOD_ID);

    // Ingots/Ores
    public static final DeferredItem<Item> ZINC_INGOT = ITEMS.register("zinc_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZINC_NUGGET = ITEMS.register("zinc_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_ZINC = ITEMS.register("raw_zinc",
            () -> new Item(new Item.Properties()));
    // Dusts
    public static final DeferredItem<Item> CRUSHED_ZINC = ITEMS.register("crushed_zinc",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
