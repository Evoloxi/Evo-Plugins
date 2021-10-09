package at.evo.plugin;

import net.minecraft.server.v1_16_R3.*;

import org.bukkit.Bukkit;
import org.bukkit.Location;

import org.bukkit.Material;
import org.bukkit.block.Chest;
import org.bukkit.craftbukkit.v1_16_R3.CraftWorld;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class EventOpenChest implements Listener {

    @EventHandler
    public void onClickChest(PlayerInteractEvent e){
        if(e.getClickedBlock().getType() == org.bukkit.Material.CHEST){
            Bukkit.getConsoleSender().sendMessage("Lol");
            Chest chest = (Chest) e.getClickedBlock().getLocation().getBlock().getState();
            chest.open();



        }

    }




}
