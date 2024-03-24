package net.leto.testingmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.leto.testingmod.TestingMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries){
        //This lists modded item entries designated for the ingredient tab in creative
        entries.add(RUBY);
        entries.add(RAW_RUBY);
    }
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(TestingMod.MOD_ID, name), item);
    }
    public static void registerModItems(){
        TestingMod.LOGGER.info("Registering Mod Items for " + TestingMod.MOD_ID);
        //This adds any entries added to the "addItemsToIngredientTabItemGroup" to the INGREDIENTS tab in minecraft creative mode
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
