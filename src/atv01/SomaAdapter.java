package atv01;

import java.util.ArrayList;
import java.util.List;

public class SomaAdapter implements SomadorEsperado{

    private SomadorExistente somadorExistente;

    public SomaAdapter(SomadorExistente somadorExistente) {
        this.somadorExistente = somadorExistente;
    }

    @Override
    public int somaVetor(int[] vetor) {

        int valor = somadorExistente.somaList(converterParaLista(vetor));

        return valor;
    }

    public List<Integer> converterParaLista(int[] vetor) {
        List<Integer> numeros = new ArrayList<>();

        for (int i : vetor) {
            numeros.add(i);
        }

        return numeros;
    }
}
