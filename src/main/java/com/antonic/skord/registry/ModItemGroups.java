package com.antonic.skord.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import static com.antonic.skord.Reference.*;

public class ModItemGroups {

    public static final ItemGroup SKORD = Registry.register(Registries.ITEM_GROUP,
            identifier(ModID + "_skord_group"),
                FabricItemGroup.builder().displayName(translate("skord.group"))
                    .icon(()-> new ItemStack(ModItems.CROP_STICKS))
                    .entries((displayContext, entries) -> {

                        //Items
                        entries.add(ModItems.CROP_STICKS);
                        entries.add(ModItems.FERTILIZER);
                        entries.add(ModItems.WEED_BE_GONE);
                        entries.add(ModItems.HYDRATION_CELL);
                        entries.add(ModItems.PLANT_LENS);
                        entries.add(ModItems.WEEDING_TROWEL);
                        entries.add(ModItems.SPADE);
                        entries.add(ModItems.CROP_ANALYZER);
                        entries.add(ModItems.PORTABLE_SCANNER);

                        //Blocks
                        entries.add(ModBlocks.GARDEN_SOIL);


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
