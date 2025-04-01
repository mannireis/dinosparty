package com.mannireis.hackcraft.item;

import com.mannireis.hackcraft.Hackcraft;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PCB = registerItem("pcb", new Item(new Item.Settings()));
    public static final Item COPPER_SPOOL = registerItem("copper_spool", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Hackcraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Hackcraft.LOGGER.info("Registering Mod Items for" + Hackcraft.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(PCB);
            fabricItemGroupEntries.add(COPPER_SPOOL);
        });
    }
}
