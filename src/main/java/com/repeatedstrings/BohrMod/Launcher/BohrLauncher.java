package com.repeatedstrings.BohrMod.Launcher;

import com.repeatedstrings.BohrMod.Handlers.BohrBlockHandler;

/**
 * Created by james on 9/20/17.
 */
public class BohrLauncher {
    public void preInit() {
        BohrBlockHandler.init();
        BohrBlockHandler.register();
    }

    public void init() {
        BohrBlockHandler.registerRenders();
    }

    public void postInit() {

    }
}
