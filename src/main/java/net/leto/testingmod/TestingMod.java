package net.leto.testingmod;

import net.fabricmc.api.ModInitializer;

import net.leto.testingmod.block.ModBlocks;
import net.leto.testingmod.item.ModItemGroups;
import net.leto.testingmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestingMod implements ModInitializer {
	public static final String MOD_ID = "testingmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		LOGGER.info("Hello Fabric world!");
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}