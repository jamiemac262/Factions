package net.tekkcraft.factions;

/**
 * Created by jamie on 07/03/2017.
 */
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.tekkcraft.factions.blocks.ModBlocks;
import net.tekkcraft.factions.items.ModItems;
import net.tekkcraft.factions.proxy.CommonProxy;

@Mod(modid = Factions.MODID, version = Factions.VERSION)
public class Factions
{
    @SidedProxy(serverSide = "net.tekkcraft.factions.proxy.CommonProxy", clientSide = "net.tekkcraft.factions.proxy.ClientProxy")
    public static CommonProxy proxy;

    public static final String MODID = "factionmod";
    public static final String VERSION = "A 1.0";

    @Mod.Instance(MODID)
    public static Factions instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println("Factions is loading!");
        ModItems.init();
        ModBlocks.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}
