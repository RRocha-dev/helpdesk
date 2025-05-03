package br.com.ionyx.helpDesk.inventories.duvida;

import br.com.ionyx.helpDesk.manager.DuvidaManager;
import br.com.ionyx.helpDesk.utils.ItemUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class DuvidaInventoryBuilder {

    public static Inventory build(Player p, DuvidaManager manager) {
        Inventory inv = Bukkit.createInventory(null, 27, ChatColor.translateAlternateColorCodes('&', "&e&lDúvidas"));

        ItemStack playerHead = ItemUtils.getPlayerHead(p);
        ItemMeta metaHead = playerHead.getItemMeta();
        metaHead.setLore(Arrays.asList(ChatColor.translateAlternateColorCodes('&', "&aVocê tem no total de &f" + manager.getTotalAtivasByPlayer(p) + " &adúvidas a serem respondidas."),
                ChatColor.translateAlternateColorCodes('&', "&aVocê gerou no total de &f" + " &adúvidas até o momento.")));

        playerHead.setItemMeta(metaHead);

        ItemStack duvidasRespondidas = new ItemStack(Material.YELLOW_STAINED_GLASS_PANE);
        ItemMeta duvidasRespondidasMeta = duvidasRespondidas.getItemMeta();

        duvidasRespondidasMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&eDúvidas respondidas"));
        duvidasRespondidasMeta.setLore(Arrays.asList(ChatColor.translateAlternateColorCodes('&', "&eVocê tem no total de &f0 &edúvidas respondidas")));
        duvidasRespondidas.setItemMeta(duvidasRespondidasMeta);

        ItemStack staffsOnline = new ItemStack(Material.CYAN_STAINED_GLASS_PANE);
        ItemMeta staffsOnlineMeta = staffsOnline.getItemMeta();

        staffsOnlineMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6Ajudantes Online"));
        staffsOnlineMeta.setLore(Arrays.asList(ChatColor.translateAlternateColorCodes('&', "&6Atualmente existem &f0 &6Ajudantes online")));
        staffsOnline.setItemMeta(staffsOnlineMeta);

        ItemStack novaDuvida = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
        ItemMeta novaDuvidaMeta = novaDuvida.getItemMeta();
        novaDuvidaMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&2Nova Dúvida"));
        novaDuvida.setItemMeta(novaDuvidaMeta);

        inv.setItem(10, playerHead);
        inv.setItem(11, duvidasRespondidas);
        inv.setItem(16, staffsOnline);
        inv.setItem(15, novaDuvida);

        return inv;
    }
}
