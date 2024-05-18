package com.antonic.skord.registry;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import static com.antonic.skord.Reference.identifier;
import static com.antonic.skord.Reference.log;

public class ModBlocks {

    public static final Block GARDEN_SOIL = registerBlock("garden_soil", new Block(AbstractBlock.Settings.copy(Blocks.DIRT)));

    public ModBlocks()
    {
        throw new AssertionError();
    }

    public static void register()
    {
        log("Registering Blocks");
    }

    private static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, identifier(name), block);
    }

    private static Item registerBlockItem(String name, Block block)
    {
        return Registry.register(Registries.ITEM, identifier(name),
                new BlockItem(block, new Item.Settings()));
    }
}
