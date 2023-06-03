package atv04;

import java.io.File;

public class Arquivo extends Elemento {

    private File file;

    public Arquivo(String nome) {
        file = new File(nome);
    }

    @Override
    long tamanho() {
        return file.length();
    }
}
