package br.com.ionyx.helpDesk.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bukkit.entity.Player;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Duvida {
    private Player playerAbriu;
    @Setter
    private Player playerFinalizou;
    private String duvida;
    @Setter
    private String resposta;
    private LocalDateTime abertura;
    @Setter
    private LocalDateTime finalizacao;
    private String status;

    public Duvida(Player playerAbriu, String duvida, LocalDateTime abertura) {
        this.playerAbriu = playerAbriu;
        this.duvida = duvida;
        this.abertura = abertura;
    }

    public String getStatus() {
        return finalizacao != null ? "FINALIZADO" : "EM ABERTO";
    }
}
