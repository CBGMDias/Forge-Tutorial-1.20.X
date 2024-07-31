package net.cbgmdias.braunmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties BANANA = new FoodProperties.Builder().nutrition(4)
            .saturationMod(4).fast()
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 120, 2), 0.2f).build();
}
