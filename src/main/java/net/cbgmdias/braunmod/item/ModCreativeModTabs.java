package net.cbgmdias.braunmod.item;

import net.cbgmdias.braunmod.BraunMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BraunMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BRAUN_TAB = CREATIVE_MODE_TABS.register("braun_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BRAUNITE.get()))
                    .title(Component.translatable("creativetab.braun_tab"))
                    .displayItems(((pParameters, pOutput) -> {
                        for(RegistryObject<Item> item : ModItems.ITEMS.getEntries()) {
                            pOutput.accept(item.get());
                        }
                        /* Loop para adicionar os itens do mod automaticamnete
                        ao invés de fazer manual:
                        pOutput.accept(ModItems.BRAUNITE.get());
                        pOutput.accept(ModItems.RAW_BRAUNITE.get());
                        obs: .get() é apenas para ModItems, o exemplo abaixo é um item do próprio mine
                        */
                        pOutput.accept(Items.BEDROCK);
                    }))
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
