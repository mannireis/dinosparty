package com.mannireis.hackcraft.datagen;

import com.mannireis.hackcraft.block.ModBlocks;
import com.mannireis.hackcraft.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGIC_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HACKCLUB_LOGO_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PCB, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHISEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_SPOOL, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAINBOW_FLESH, Models.GENERATED);
        itemModelGenerator.register(ModItems.JUICE_CAFE_CASSETE, Models.GENERATED);
        itemModelGenerator.register(ModItems.FIRE_MACE, Models.GENERATED);
    }
}
