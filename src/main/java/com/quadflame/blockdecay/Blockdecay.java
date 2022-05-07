package com.quadflame.blockdecay;

import com.quadflame.blockdecay.Events.EventBlockDecay;
import org.bukkit.plugin.java.JavaPlugin;

public final class Blockdecay extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EventBlockDecay(this), this);
    }
}
