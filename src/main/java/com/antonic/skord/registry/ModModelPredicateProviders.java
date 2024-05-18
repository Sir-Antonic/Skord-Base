package com.antonic.skord.registry;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

import static com.antonic.skord.Reference.*;

public class ModModelPredicateProviders extends FabricModelProvider {

    public ModModelPredicateProviders(FabricDataOutput output) {
        super(output);
    }

    public static void register() {
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        logRGB256("Generating Block Model Data", 0, 255, 0);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        logRGB256("Generating Block Model Data", 0, 255, 0);

        itemModelGenerator.register(ModItems.CROP_STICKS, Models.GENERATED);
        itemModelGenerator.register(ModItems.FERTILIZER, Models.GENERATED);
        itemModelGenerator.register(ModItems.WEED_BE_GONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.HYDRATION_CELL, Models.GENERATED);
        itemModelGenerator.register(ModItems.PLANT_LENS, Models.GENERATED);
        itemModelGenerator.register(ModItems.WEEDING_TROWEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CROP_ANALYZER, Models.GENERATED);
        itemModelGenerator.register(ModItems.PORTABLE_SCANNER, Models.GENERATED);


    }
}
