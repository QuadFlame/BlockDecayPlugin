package com.quadflame.blockdecay.Events;

import com.quadflame.blockdecay.Blockdecay;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;

public class EventBlockDecay implements Listener {

    Blockdecay plugin;
    public EventBlockDecay(Blockdecay listener)
    {
        this.plugin = listener;
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent e){
        Player p = e.getPlayer();
        Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){
            @Override
            public void run(){
                if (e.getBlock().isEmpty() == false){
                    e.getBlock().setType(Material.REDSTONE_BLOCK);
                }
                Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){
                    @Override
                    public void run(){
                        if (e.getBlock().isEmpty() == false){
                            e.getBlock().setType(Material.AIR);
                        }
                    }
                }, 40L);
            }
        }, 100L);
    }
}
