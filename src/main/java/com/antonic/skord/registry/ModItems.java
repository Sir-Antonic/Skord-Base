package com.antonic.skord.registry;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import static com.antonic.skord.Reference.identifier;
import static com.antonic.skord.Reference.log;

public class ModItems {

    public static final Item BINDING_STRING = registerItem("binding_string", new Item(new Item.Settings()));

    public static final Item CROP_STICKS = registerItem("crop_sticks", new Item(new Item.Settings()));
    public static final Item FERTILIZER = registerItem("fertilizer", new Item(new Item.Settings()));
    public static final Item WEED_BE_GONE = registerItem("weed_be_gone", new Item(new Item.Settings()));
    public static final Item HYDRATION_CELL = registerItem("hydration_cell", new Item(new Item.Settings()));
    public static final Item PLANT_LENS = registerItem("plant_lens", new Item(new Item.Settings()));
    public static final Item WEEDING_TROWEL = registerItem("weeding_trowel", new Item(new Item.Settings()));
    public static final Item SPADE = registerItem("spade", new Item(new Item.Settings()));
    public static final Item CROP_ANALYZER = registerItem("crop_analyzer", new Item(new Item.Settings()));
    public static final Item PORTABLE_SCANNER = registerItem("portable_scanner", new Item(new Item.Settings()));


    public ModItems()
    {
        throw new AssertionError();
    }

    public static void register()
    {
        log("Registering Items");
    }

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, identifier(name), item);
    }
}
