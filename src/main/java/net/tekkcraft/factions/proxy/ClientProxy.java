package net.tekkcraft.factions.proxy;

/**
 * Created by jamie on 07/03/2017.
 */
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.tekkcraft.factions.Factions;

public class ClientProxy extends CommonProxy {

    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Factions.MODID + ":" + id, "inventory"));
    }
}