package net.tekkcraft.factions.blocks;

/**
 * Created by jamie on 07/03/2017.
 */
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.tekkcraft.factions.items.ItemModelProvider;

import java.util.HashMap;

public class ModBlocks {
    public static HashMap<Block, Block> factionBlocks;
    public static BlockCore factionCore;
    public static BlockFactionDirt factionDirt;
    public static BlockFactionGrass factionGrass;
    public static BlockFactionLog factionLog;

    public static void init() {
        factionCore = register(new BlockCore().setCreativeTab());
        factionDirt = register(new BlockFactionDirt());
        factionGrass = register(new BlockFactionGrass());
        factionLog = register(new BlockFactionLog());
        prepareBlockMap();
    }

    private static <T extends Block> T register (T block, ItemBlock itemBlock) {

        GameRegistry.register(block);
        if(itemBlock != null) {
            GameRegistry.register(itemBlock);
        }

        if(block instanceof ItemModelProvider) {
            ((ItemModelProvider)block).registerItemModel(itemBlock);
        }

        return block;
    }

    private static <T extends Block> T register(T block) {
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        return register(block, itemBlock);
    }

    private static void prepareBlockMap(){
        factionBlocks = new HashMap<Block, Block>();
        factionBlocks.put(Blocks.GRASS, ModBlocks.factionDirt);
        factionBlocks.put(Blocks.DIRT, ModBlocks.factionDirt);
        factionBlocks.put(Blocks.LOG, ModBlocks.factionLog);
    }

}