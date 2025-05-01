package com.mannireis.hackcraft;

import com.mannireis.hackcraft.block.ModBlocks;
import com.mannireis.hackcraft.effect.ModEffects;
import com.mannireis.hackcraft.item.ModItems;
import com.mannireis.hackcraft.potion.ModPotions;
import com.mannireis.hackcraft.sound.ModSounds;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
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
		ModSounds.registerSounds();

		ModEffects.registerEffects();
		ModPotions.registerPotions();

		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.AWKWARD, Items.SLIME_BALL, ModPotions.SLIMEY_POTION);
		});
	}
}