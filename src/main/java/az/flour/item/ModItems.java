package az.flour.item;

import az.flour.Flour;
import az.flour.proxy.ClientProxy;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Flour.MODID)
public class ModItems { //More like ModItem
    public static ItemFlour flour = new ItemFlour();

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(flour);

        if (Flour.proxy instanceof ClientProxy) {
            ModelLoader.setCustomModelResourceLocation(
                    flour,
                    0,
                    new ModelResourceLocation(flour.getRegistryName(), "inventory")
            );
        }
    }
}
