package com.mannireis.hackcraft.sound;

import com.mannireis.hackcraft.Hackcraft;

import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent JUICE_CAFE = registerSoundEvent("juice_cafe");
    public static final RegistryKey<JukeboxSong> JUICE_CAFE_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Hackcraft.MOD_ID, "juice_cafe"));

    private  static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(Hackcraft.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        Hackcraft.LOGGER.info("Registering Mod Sounds for " + Hackcraft.MOD_ID);
    }
}
