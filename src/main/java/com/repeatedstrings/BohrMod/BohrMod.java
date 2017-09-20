package com.repeatedstrings.BohrMod;

import com.repeatedstrings.BohrMod.Config.Config;
import com.repeatedstrings.BohrMod.Launcher.BohrLauncher;
import net.minecraftforge.fml.common.Mod.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

/**
 * Created by james on 9/20/17.
 */

@Mod(modid = Config.MODID, name = Config.NAME, version = Config.VERSION)
public class BohrMod {
        @SidedProxy(clientSide = Config.CLIENT_PROXY, serverSide = Config.CLIENT_PROXY)
        public static BohrLauncher bohrLoader;

        @EventHandler
        public void preInit(FMLPostInitializationEvent event) {
            bohrLoader.preInit();
        }

        @EventHandler
        public void init(FMLInitializationEvent event) {
            bohrLoader.init();
        }

        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
            bohrLoader.postInit();
        }
}
