package com.mannireis.hackcraft.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MaceItem;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class FireMace extends MaceItem {
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand); // Get the item stack
        if (!world.isClient) {
            // Your logic here (server-side only)
            // Get the player's look direction and apply speed
            Vec3d lookVec = user.getRotationVector().normalize();
            double speed = 1.5; // Adjust speed as needed

            // Set the player's velocity
            user.setVelocity(lookVec.multiply(speed));
            user.velocityModified = true; // Ensure the velocity update is sent to the client
            // Add cooldown to prevent spamming (20 ticks = 1 second)
            user.getItemCooldownManager().set(this, 20);

            // Play a sound effect
            world.playSound(null, user.getX(), user.getY(), user.getZ(),
                    SoundEvents.ENTITY_BLAZE_SHOOT, SoundCategory.PLAYERS, 1.0F, 1.0F);
        }

        // Return success without consuming the item
        return TypedActionResult.success(stack);
    }

    public FireMace(Settings settings) {
        super(settings);

    }
}
