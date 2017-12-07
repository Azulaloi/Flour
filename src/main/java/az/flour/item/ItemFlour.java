package az.flour.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemFlour extends Item {
    public ItemFlour() {
        setUnlocalizedName("flour.flour");
        setRegistryName("flour");
        this.setCreativeTab(CreativeTabs.FOOD);
    }
}
