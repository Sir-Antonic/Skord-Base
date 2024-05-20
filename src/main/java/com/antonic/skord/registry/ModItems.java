package com.antonic.skord.registry;

import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterials;
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
    public static final Item CROP_ANALYZER = registerItem("crop_analyzer", new Item(new Item.Settings()));
    public static final Item PORTABLE_SCANNER = registerItem("portable_scanner", new Item(new Item.Settings()));

    //region Tools
    public static final Item WOODEN_SPADE = registerItem("wooden_spade",
            new ShovelItem(ToolMaterials.WOOD, new Item.Settings().attributeModifiers(
                    ShovelItem.createAttributeModifiers(
                            ToolMaterials.WOOD,
                            0.0f, -0.0f))));

    public static final Item STONE_SPADE = registerItem("stone_spade",
            new ShovelItem(ToolMaterials.STONE, new Item.Settings().attributeModifiers(
                    ShovelItem.createAttributeModifiers(
                            ToolMaterials.STONE,
                            1.0f, -0.0f))));

    public static final Item IRON_SPADE = registerItem("iron_spade",
            new ShovelItem(ToolMaterials.IRON, new Item.Settings().attributeModifiers(
                    ShovelItem.createAttributeModifiers(
                            ToolMaterials.IRON,
                            2.0f, -0.0f))));

    public static final Item GOLDEN_SPADE = registerItem("golden_spade",
            new ShovelItem(ToolMaterials.GOLD, new Item.Settings().attributeModifiers(
                    ShovelItem.createAttributeModifiers(
                            ToolMaterials.GOLD,
                            0.0f, -0.0f))));

    public static final Item DIAMOND_SPADE = registerItem("diamond_spade",
            new ShovelItem(ToolMaterials.DIAMOND, new Item.Settings().attributeModifiers(
                    ShovelItem.createAttributeModifiers(
                            ToolMaterials.DIAMOND,
                            3.0f, -0.0f))));

    public static final Item NETHERITE_SPADE = registerItem("netherite_spade",
            new ShovelItem(ToolMaterials.NETHERITE, new Item.Settings().attributeModifiers(
                    ShovelItem.createAttributeModifiers(
                            ToolMaterials.NETHERITE,
                            4.0f, -0.6f))));
    //endregion


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
