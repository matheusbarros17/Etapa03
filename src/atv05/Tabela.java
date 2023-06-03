package atv05;

import java.util.ArrayList;
import java.util.List;

public class Tabela implements Componente {

    private List<Componente> componentes = new ArrayList<>();

    public void adicionar(Componente c) {
        componentes.add(c);
    }

    public void imprimir() {
        // Imprime as linhas da tabela
        for (Componente componente : componentes) {
            componente.imprimir();
        }
    }
}
