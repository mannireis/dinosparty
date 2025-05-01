package com.mannireis.hackcraft.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent RAINBOW_FLESH = new FoodComponent.Builder().nutrition(6).saturationModifier(2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 900), 100f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 900), 80f).build();
}
