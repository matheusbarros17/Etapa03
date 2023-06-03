package atv05;

import java.util.ArrayList;
import java.util.List;

public class Linha implements Componente {

    private List<Componente> componentes = new ArrayList<>();

    public void adicionar(Componente c) {
        componentes.add(c);
    }

    public void imprimir() {
        // Imprime a borda lateral
        System.out.println(" |");

        // Imprime a linha.
        int tamanho = (componentes.size() * 17) + 5;
        char[] linha = new char[tamanho];
        for (int i = 0; i < tamanho; i++) linha[i] = '-';
        System.out.println(" " + new String(linha));

        // Imprime os componentes da linha
        for (Componente componente : componentes) {
            componente.imprimir();
        }
    }
}