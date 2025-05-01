package com.mannireis.hackcraft.datagen;

import com.mannireis.hackcraft.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CHISEL)
                .pattern(" I ")
                .pattern("NSN")
                .pattern("S  ")
                .input('S', Items.STICK)
                .input('N', Items.IRON_NUGGET)
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(recipeExporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_SPOOL, 2)
                .input(Items.OAK_FENCE)
                .input(Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PCB, 3)
                .pattern("#G")
                .pattern("#G")
                .pattern("#G")
                .input('#', ModItems.COPPER_SPOOL)
                .input('G', Items.GREEN_STAINED_GLASS_PANE)
                .criterion(hasItem(Items.GREEN_STAINED_GLASS_PANE), conditionsFromItem(Items.GREEN_STAINED_GLASS_PANE))
                .offerTo(recipeExporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_SPOOL, 2)
                .input(Items.HEAVY_CORE)
                .input(Items.BLAZE_ROD)
                .criterion(hasItem(Items.HEAVY_CORE), conditionsFromItem(Items.BLAZE_ROD))
                .offerTo(recipeExporter);
    }
}
