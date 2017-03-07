package net.tekkcraft.factions.blocks;

/**
 * Created by jamie on 07/03/2017.
 */

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tekkcraft.factions.Factions;
import net.tekkcraft.factions.items.ItemModelProvider;

import java.util.Random;

public class BlockBase extends Block implements ItemModelProvider{

    protected String name;

    public BlockBase(Material materialIn, String name) {
        super(materialIn);
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        //setCreativeTab(Factions.creativeTab); //this creativetab hasn't been implemented yet
    }

    @Override
    public void registerItemModel(Item itemBlock) {
        Factions.proxy.registerItemRenderer(itemBlock, 0, name);

    }

    @Override
    public BlockBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

    protected void doBlockSpread(World worldIn, BlockPos pos, IBlockState state, Random rand){
        if (!worldIn.isRemote)
        {
            for (int i = 0; i < 4; ++i)
            {
                BlockPos blockpos = pos.add(rand.nextInt(3) - 1, rand.nextInt(5) - 3, rand.nextInt(3) - 1);

                if (blockpos.getY() >= 0 && blockpos.getY() < 256 && !worldIn.isBlockLoaded(blockpos))
                {
                    return;
                }

                IBlockState iblockstate1 = worldIn.getBlockState(blockpos);

                if (ModBlocks.factionBlocks.get(iblockstate1.getBlock()) != null)
                {
                    worldIn.setBlockState(blockpos, ModBlocks.factionBlocks.get(iblockstate1.getBlock()).getDefaultState());
                }
            }
        }
    }
}

