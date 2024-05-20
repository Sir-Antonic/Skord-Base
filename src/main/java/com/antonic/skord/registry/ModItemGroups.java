package com.antonic.skord.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import static com.antonic.skord.Reference.*;

public class ModItemGroups {

    public static final ItemGroup BLOCKS = Registry.register(Registries.ITEM_GROUP,
            identifier(ModID + "_block_group"),
                FabricItemGroup.builder().displayName(translate("block.group"))
                    .icon(()-> new ItemStack(ModBlocks.GARDEN_SOIL))
                    .entries((displayContext, entries) -> {

                        entries.add(ModBlocks.GARDEN_SOIL);

                    }).build());

    public static final ItemGroup INGREDIENTS = Registry.register(Registries.ITEM_GROUP,
            identifier(ModID + "_ingredients_group"),
            FabricItemGroup.builder().displayName(translate("ingredients.group"))
                    .icon(()-> new ItemStack(ModItems.FERTILIZER))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CROP_STICKS);
                        entries.add(ModItems.FERTILIZER);
                        entries.add(ModItems.HYDRATION_CELL);
                        entries.add(ModItems.WEED_BE_GONE);
                    }).build());

    public static final ItemGroup TOOLS = Registry.register(Registries.ITEM_GROUP,
            identifier(ModID + "_tools_group"),
            FabricItemGroup.builder().displayName(translate("tools.group"))
                    .icon(()-> new ItemStack(ModItems.CROP_ANALYZER))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CROP_ANALYZER);
                        entries.add(ModItems.PLANT_LENS);
                        entries.add(ModItems.PORTABLE_SCANNER);
                        entries.add(ModItems.WEEDING_TROWEL);
                        entries.add(ModItems.WOODEN_SPADE);
                        entries.add(ModItems.STONE_SPADE);
                        entries.add(ModItems.IRON_SPADE);
                        entries.add(ModItems.GOLDEN_SPADE);
                        entries.add(ModItems.DIAMOND_SPADE);
                        entries.add(ModItems.NETHERITE_SPADE);
                    }).build());

    public ModItemGroups()
    {
        throw new AssertionError();
    }

    public static void register()
    {
        log("Registering Item Groups");
    }
}
