package net.tekkcraft.factions.items;

/**
 * Created by jamie on 07/03/2017.
 */
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

  //  public static ItemBase ingotCopper;
  public static final CreativeTabs tabFactions = new CreativeTabs("Factions") {
      @Override public Item getTabIconItem() {
          return Items.ENDER_EYE;
      }
  };
    public static void init() {
       // ingotCopper = register(new ItemBase("ingotCopper").setCreativeTab(CreativeTabs.MATERIALS));
    }

    private static <T extends Item> T register(T item) {
        GameRegistry.register(item);

        if(item instanceof ItemModelProvider) {
            ((ItemModelProvider)item).registerItemModel(item);
        }

        return item;
    }
}