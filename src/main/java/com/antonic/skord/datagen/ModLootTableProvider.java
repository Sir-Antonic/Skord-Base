package com.antonic.skord.datagen;

import com.antonic.skord.registry.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

import static com.antonic.skord.Reference.logRGB256;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

        logRGB256("Generating Loot Table Data", 0, 255, 0);

        addDrop(ModBlocks.GARDEN_SOIL);

    }

    private LootTable.Builder customOreDrops(Block drop, Item item, float min, float max)
    {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop,
                (LootPoolEntry.Builder)
                        this.applyExplosionDecay(drop,
                                ((LeafEntry.Builder)
                                        ItemEntry.builder(item)
                                                .apply(SetCountLootFunction
                                                        .builder(UniformLootNumberProvider
                                                                .create(min, max))))
                                        .apply(ApplyBonusLootFunction
                                                .oreDrops(Enchantments.FORTUNE))));
    }

    private LootTable.Builder customOreDrops(Block drop, Item item)
    {
        return customOreDrops(drop, item, 2.0f, 5.0f);
    }
}
