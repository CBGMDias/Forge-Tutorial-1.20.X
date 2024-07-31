package net.cbgmdias.braunmod.item;

import net.cbgmdias.braunmod.BraunMod;
import net.cbgmdias.braunmod.item.custom.MetalDetectorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BraunMod.MOD_ID);

public static final RegistryObject<Item> BRAUNITE = ITEMS.register("braunite",
        () -> new Item(new Item.Properties()));

public static final RegistryObject<Item> RAW_BRAUNITE = ITEMS.register("raw_braunite",
            () -> new Item(new Item.Properties()));

public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(500)));

    public static final RegistryObject<Item> BANANA = ITEMS.register("banana",
            () -> new Item(new Item.Properties().food(ModFoods.BANANA)));

public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
