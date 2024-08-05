package net.cbgmdias.braunmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodConstants;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties BANANA = new FoodProperties.Builder().nutrition(4)
            .saturationMod(FoodConstants.FOOD_SATURATION_NORMAL).fast().alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 1), 0.2f)
            .build();

    public static final FoodProperties MARIJUANA = new FoodProperties.Builder().nutrition(1)
            .saturationMod(FoodConstants.FOOD_SATURATION_POOR).fast().alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 200, 0), 0.3f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 400, 1), 0.15f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 0), 0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 300, 1), 0.1f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 400, 2), 0.05f)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 1000, 1), 0.1f)
            .build();

    public static final FoodProperties MARIJUANA_ZAZA = new FoodProperties.Builder().nutrition(0)
            .saturationMod(FoodConstants.FOOD_SATURATION_POOR).alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.LEVITATION, 30, 1), 0.8f)
            .build();
}
