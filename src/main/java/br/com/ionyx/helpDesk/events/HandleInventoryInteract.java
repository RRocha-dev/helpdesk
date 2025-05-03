package br.com.ionyx.helpDesk.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryInteractEvent;

public class HandleInventoryInteract implements Listener {
    @EventHandler
    public void onInventoryInteract(InventoryInteractEvent event) {
        if (event.getView().getTitle().equalsIgnoreCase("&e&lDúvidas")) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (event.getView().getTitle().equalsIgnoreCase("§e§lDúvidas")) {
            event.setCancelled(true);
        }
    }
}
