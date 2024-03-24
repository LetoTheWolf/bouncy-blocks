package net.leto.testingmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.leto.testingmod.TestingMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TestingMod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
entries.add(ModItems.RUBY);
entries.add(ModItems.RAW_RUBY);
                    }).build());
    public static void registerItemGroups(){
        TestingMod.LOGGER.info("Registering Item Groups for " +TestingMod.MOD_ID);
    }
}