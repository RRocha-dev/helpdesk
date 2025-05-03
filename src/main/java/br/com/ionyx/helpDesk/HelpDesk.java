package br.com.ionyx.helpDesk;

import br.com.ionyx.helpDesk.commands.DuvidasCommand;
import br.com.ionyx.helpDesk.events.HandleInventoryInteract;
import br.com.ionyx.helpDesk.manager.DuvidaManager;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public final class HelpDesk extends JavaPlugin {

    @Getter
    private DuvidaManager duvidaManager;

    @Override
    public void onEnable() {
        this.duvidaManager = new DuvidaManager();

        getCommand("duvidas").setExecutor(new DuvidasCommand(duvidaManager));
        getServer().getPluginManager().registerEvents(new HandleInventoryInteract(), this);
    }

    @Override
    public void onDisable() {
    }
}
