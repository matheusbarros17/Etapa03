package atv03;

import java.util.ArrayList;
import java.util.List;

public class Experimento {

    private List<RoboAction> sequenciaAcoes;

    public Experimento() {
        sequenciaAcoes = new ArrayList<>();
    }

    public void adicionarAcao(RoboAction acao) {
        sequenciaAcoes.add(acao);
    }

    public void executarTeste() {
        for (RoboAction acao : sequenciaAcoes) {
            acao.execute();
        }
    }
}
