package br.com.ionyx.helpDesk.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class ItemUtils {

    public static ItemStack getPlayerHead(Player p) {
        ItemStack head = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta headMeta = (SkullMeta) head.getItemMeta();
        headMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&a" + p.getDisplayName()));
        headMeta.setOwningPlayer(Bukkit.getOfflinePlayer(p.getUniqueId()));

        head.setItemMeta(headMeta);

        return head;
    }
}
