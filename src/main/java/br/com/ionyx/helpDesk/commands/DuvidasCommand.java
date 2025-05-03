package br.com.ionyx.helpDesk.commands;

import br.com.ionyx.helpDesk.inventories.duvida.DuvidaInventoryBuilder;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DuvidasCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4Este comando só pode ser utilizado por um player"));
            return true;
        }

        Player player = (Player) sender;

        player.openInventory(DuvidaInventoryBuilder.build(player));

        return true;
    }
}
