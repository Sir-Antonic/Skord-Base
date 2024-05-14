package com.antonic.skord.registry;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import static com.antonic.skord.Reference.identifier;
import static com.antonic.skord.Reference.log;

public class ModItems {

    public static final Item CROP_STICKS = registerItem("crop_stick", new Item(new Item.Settings()));

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
