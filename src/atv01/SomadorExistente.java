package atv01;

import java.util.List;

public class SomadorExistente {

    public int somaList(List<Integer> lista){

        int resultado = 0;
        for (int i : lista) resultado += i;

        return resultado;
    }
}
