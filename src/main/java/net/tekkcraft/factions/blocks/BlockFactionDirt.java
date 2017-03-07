package net.tekkcraft.factions.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.tekkcraft.factions.items.ModItems;

import javax.annotation.Nullable;
import java.util.Random;

/**
 * Created by jamie on 07/03/2017.
 */
public class BlockFactionDirt extends BlockBase{

    public BlockFactionDirt() {
        super(Material.GRASS, "factionDirt");
        this.setTickRandomly(true);
        this.setCreativeTab(ModItems.tabFactions);
    }

    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        doBlockSpread(worldIn, pos, state, rand);
    }
}
