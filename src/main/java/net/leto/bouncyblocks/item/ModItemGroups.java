package net.leto.bouncyblocks.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.leto.bouncyblocks.BouncyBlocks;
import net.leto.bouncyblocks.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BOUNCY_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BouncyBlocks.MOD_ID, "bouncyblocks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.bouncyblocks"))
                    .icon(() -> new ItemStack(ModBlocks.RED_BOUNCY_BED_BLOCK)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.WHITE_BOUNCY_BED_BLOCK);
entries.add(ModBlocks.LIGHT_GRAY_BOUNCY_BED_BLOCK);
                        entries.add(ModBlocks.GRAY_BOUNCY_BED_BLOCK);
                        entries.add(ModBlocks.BLACK_BOUNCY_BED_BLOCK);
                        entries.add(ModBlocks.BROWN_BOUNCY_BED_BLOCK);
                        entries.add(ModBlocks.RED_BOUNCY_BED_BLOCK);
                        entries.add(ModBlocks.ORANGE_BOUNCY_BED_BLOCK);
                        entries.add(ModBlocks.YELLOW_BOUNCY_BED_BLOCK);
                        entries.add(ModBlocks.LIME_BOUNCY_BED_BLOCK);
                        entries.add(ModBlocks.GREEN_BOUNCY_BED_BLOCK);
                        entries.add(ModBlocks.CYAN_BOUNCY_BED_BLOCK);
                        entries.add(ModBlocks.LIGHT_BLUE_BOUNCY_BED_BLOCK);
                        entries.add(ModBlocks.BLUE_BOUNCY_BED_BLOCK);
                        entries.add(ModBlocks.PURPLE_BOUNCY_BED_BLOCK);
                        entries.add(ModBlocks.MAGENTA_BOUNCY_BED_BLOCK);
                        entries.add(ModBlocks.PINK_BOUNCY_BED_BLOCK);
                    }).build());
    public static void registerItemGroups(){
        BouncyBlocks.LOGGER.info("Registering Item Groups for " + BouncyBlocks.MOD_ID);
    }
}
