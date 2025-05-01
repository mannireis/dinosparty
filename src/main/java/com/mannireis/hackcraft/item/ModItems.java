package com.mannireis.hackcraft.item;

import com.mannireis.hackcraft.Hackcraft;
import com.mannireis.hackcraft.item.custom.ChiselItem;
import com.mannireis.hackcraft.sound.ModSounds;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PCB = registerItem("pcb", new Item(new Item.Settings()));
    public static final Item COPPER_SPOOL = registerItem("copper_spool", new Item(new Item.Settings()));

    public static final Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings().maxDamage(32)));
    public static final Item RAINBOW_FLESH = registerItem("rainbow_flesh", new Item(new Item.Settings().food(ModFoodComponents.RAINBOW_FLESH)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Hackcraft.MOD_ID, name), item);
    }

    public static Item JUICE_CAFE_CASSETE = registerItem("juice_cafe_cassete",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.JUICE_CAFE_KEY).maxCount(1)));

    public static void registerModItems() {
        Hackcraft.LOGGER.info("Registering Mod Items for" + Hackcraft.MOD_ID);

        ItemGroupEvents .modifyEntriesEvent(ItemGroups.TOOLS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(CHISEL);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(PCB);
            fabricItemGroupEntries.add(COPPER_SPOOL);
        });
        ItemGroupEvents .modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(RAINBOW_FLESH);
        });
        ItemGroupEvents .modifyEntriesEvent(ItemGroups.TOOLS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(JUICE_CAFE_CASSETE);
        });
    }
}
