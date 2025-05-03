package br.com.ionyx.helpDesk.manager;

import br.com.ionyx.helpDesk.model.Duvida;
import org.bukkit.entity.Player;

import java.time.LocalDateTime;
import java.util.*;

public class DuvidaManager {
    private final Map<UUID, List<Duvida>> duvidasAtivas = new HashMap();
    private final Map<UUID, List<Duvida>> duvidasFinalizadas = new HashMap();

    public void inserirNovaDuvida(Player p, String duvida) {
        if(duvida != null && !duvida.isBlank()) {
            Duvida novaDuvida = new Duvida(p, duvida, LocalDateTime.now());
            List<Duvida> duvidasAtuais = duvidasAtivas.get(p.getUniqueId());
            duvidasAtuais.add(novaDuvida);
            duvidasAtivas.remove(p.getUniqueId());
            duvidasAtivas.put(p.getUniqueId(), duvidasAtuais);
        }
    }

    public int getTotalByPlayer(Player p) {
        return duvidasAtivas.getOrDefault(p.getUniqueId(), new ArrayList<>()).size();
    }
}
