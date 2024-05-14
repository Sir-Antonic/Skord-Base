package com.antonic.registry;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import static com.antonic.Reference.identifier;
import static com.antonic.Reference.log;

public class ModItems {

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
