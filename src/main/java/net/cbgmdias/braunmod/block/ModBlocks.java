package net.cbgmdias.braunmod.block;

import net.cbgmdias.braunmod.BraunMod;
import net.cbgmdias.braunmod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BraunMod.MOD_ID);

    public static final RegistryObject<Block> BRAUNITE_BLOCK = registerBlock("braunite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK).strength(15.0F, 1200F)
                    .sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> RAW_BRAUNITE_BLOCK = registerBlock("raw_braunite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANCIENT_DEBRIS).strength(5.0F, 1200F)));

    public static final RegistryObject<Block> BRAUNITE_ORE = registerBlock("braunite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(10.0F, 1200.0F).requiresCorrectToolForDrops(), UniformInt.of(7,13)));

    public static final RegistryObject<Block> DEEPSLATE_BRAUNITE_ORE = registerBlock("deepslate_braunite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(12.0F, 1200.0F).requiresCorrectToolForDrops(), UniformInt.of(8,14)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }


}
