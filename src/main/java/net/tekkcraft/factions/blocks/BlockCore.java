package net.tekkcraft.factions.blocks;

/**
 * Created by jamie on 07/03/2017.
 */
import net.minecraft.block.BlockDirt;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod;
import net.tekkcraft.factions.items.ModItems;

import java.util.Random;

public class BlockCore extends BlockBase {

    public BlockCore() {
        super(Material.ROCK, "factionCore");
        setHardness(3f);
        setResistance(5f);
    }


    public BlockCore setCreativeTab() {
        super.setCreativeTab(ModItems.tabFactions);
        return this;
    }


}
