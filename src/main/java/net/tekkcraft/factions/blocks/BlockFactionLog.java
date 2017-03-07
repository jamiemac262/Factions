package net.tekkcraft.factions.blocks;

import net.minecraft.block.BlockLog;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tekkcraft.factions.items.ModItems;

import java.util.Random;

/**
 * Created by jamie on 07/03/2017.
 */
public class BlockFactionLog extends BlockBase {

    public BlockFactionLog(){

        super(Material.WOOD, "factionLog");
        this.setTickRandomly(true);
        this.setCreativeTab(ModItems.tabFactions);
    }

    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        doBlockSpread(worldIn, pos, state, rand);
    }
}
