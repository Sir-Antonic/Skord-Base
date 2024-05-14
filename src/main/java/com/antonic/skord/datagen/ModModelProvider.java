package com.antonic.skord.datagen;

import com.antonic.skord.registry.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

import static com.antonic.skord.Reference.logRGB256;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        logRGB256("Generating Block Model Data", 0, 255, 0);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        logRGB256("Generating Item Model Data", 0, 255, 0);

        itemModelGenerator.register(ModItems.CROP_STICKS, Models.GENERATED);

    }
}
