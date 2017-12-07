package az.flour.proxy;

import az.flour.Config;
import az.flour.item.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.io.File;

public class CommonProxy {
    public static Configuration config;

    public void preInit(FMLPreInitializationEvent event) {
        File dir = event.getSuggestedConfigurationFile();
        config = new Configuration(new File(dir.getPath()));
        Config.initConfig();
    }

    public void init(FMLInitializationEvent event) {
        GameRegistry.addSmelting(ModItems.flour, new ItemStack(Items.BREAD, 1), Config.flourXP);
    }

    public void postInit(FMLPostInitializationEvent event) {
    }
}
