package az.flour;

import az.flour.proxy.CommonProxy;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Level;

public class Config {
    public static float flourXP = 0;

    public static boolean verboseLogging = false;

    public static void initConfig() {
        Configuration config = CommonProxy.config;
        try{
            config.load();
            readConfig(config);
        } catch (Exception exception) {
            Flour.logger.log(Level.ERROR, "Flour: Exception loading config!", exception);
        } finally {
            if (config.hasChanged()) {
                config.save();
            }
        }
    }

    public static void readConfig(Configuration config) {
        flourXP = config.getFloat("Flour Baking XP", "Config", flourXP, 0.0F, 1.0F, "How much XP pops out of the furnace when baking flour.");

        verboseLogging = config.getBoolean("Verbose Logging", "Debug", verboseLogging, "Set to true for more log info.");
    }

}
