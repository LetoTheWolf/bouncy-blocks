package net.leto.bouncyblocks.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.leto.bouncyblocks.BouncyBlocks;
import net.leto.bouncyblocks.block.custom.BedBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block WHITE_BOUNCY_BED_BLOCK = registerBlock("white_bouncy_bed_block",
            new BedBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LIGHT_GRAY_BOUNCY_BED_BLOCK = registerBlock("light_gray_bouncy_bed_block",
            new BedBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block GRAY_BOUNCY_BED_BLOCK = registerBlock("gray_bouncy_bed_block",
            new BedBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block BLACK_BOUNCY_BED_BLOCK = registerBlock("black_bouncy_bed_block",
            new BedBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block BROWN_BOUNCY_BED_BLOCK = registerBlock("brown_bouncy_bed_block",
            new BedBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block RED_BOUNCY_BED_BLOCK = registerBlock("red_bouncy_bed_block",
            new BedBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block ORANGE_BOUNCY_BED_BLOCK = registerBlock("orange_bouncy_bed_block",
            new BedBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block YELLOW_BOUNCY_BED_BLOCK = registerBlock("yellow_bouncy_bed_block",
            new BedBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LIME_BOUNCY_BED_BLOCK = registerBlock("lime_bouncy_bed_block",
            new BedBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block GREEN_BOUNCY_BED_BLOCK = registerBlock("green_bouncy_bed_block",
            new BedBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block CYAN_BOUNCY_BED_BLOCK = registerBlock("cyan_bouncy_bed_block",
            new BedBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LIGHT_BLUE_BOUNCY_BED_BLOCK = registerBlock("light_blue_bouncy_bed_block",
            new BedBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block BLUE_BOUNCY_BED_BLOCK = registerBlock("blue_bouncy_bed_block",
            new BedBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block PURPLE_BOUNCY_BED_BLOCK = registerBlock("purple_bouncy_bed_block",
            new BedBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block MAGENTA_BOUNCY_BED_BLOCK = registerBlock("magenta_bouncy_bed_block",
            new BedBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block PINK_BOUNCY_BED_BLOCK = registerBlock("pink_bouncy_bed_block",
            new BedBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BouncyBlocks.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(BouncyBlocks.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks(){
        BouncyBlocks.LOGGER.info("Registering ModBlocks for " + BouncyBlocks.MOD_ID);
    }
}
