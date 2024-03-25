package net.leto.bouncyblocks;

import net.fabricmc.api.ModInitializer;

import net.leto.bouncyblocks.block.ModBlocks;
import net.leto.bouncyblocks.item.ModItemGroups;
import net.leto.bouncyblocks.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BouncyBlocks implements ModInitializer {
	public static final String MOD_ID = "bouncyblocks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		LOGGER.info("Hello Fabric world!");
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}