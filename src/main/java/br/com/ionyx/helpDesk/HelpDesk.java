package br.com.ionyx.helpDesk;

import br.com.ionyx.helpDesk.commands.DuvidasCommand;
import br.com.ionyx.helpDesk.events.HandleInventoryInteract;
import org.bukkit.plugin.java.JavaPlugin;

public final class HelpDesk extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("duvidas").setExecutor(new DuvidasCommand());
        getServer().getPluginManager().registerEvents(new HandleInventoryInteract(), this);
    }

    @Override
    public void onDisable() {
    }
}
