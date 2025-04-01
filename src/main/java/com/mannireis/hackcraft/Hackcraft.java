package com.mannireis.hackcraft;

import com.mannireis.hackcraft.block.ModBlocks;
import com.mannireis.hackcraft.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//Cool Comment
public class Hackcraft implements ModInitializer {
	public static final String MOD_ID = "hackcraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}