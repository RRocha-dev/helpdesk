package br.com.ionyx.helpDesk.commands;

import br.com.ionyx.helpDesk.inventories.duvida.DuvidaInventoryBuilder;
import br.com.ionyx.helpDesk.manager.DuvidaManager;
import lombok.AllArgsConstructor;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@AllArgsConstructor
public class DuvidasCommand implements CommandExecutor {

    private DuvidaManager duvidaManager;

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4Este comando só pode ser utilizado por um player"));
            return true;
        }

        Player player = (Player) sender;

        player.openInventory(DuvidaInventoryBuilder.build(player, duvidaManager));

        return true;
    }
}
