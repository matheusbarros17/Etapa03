package atv04;

import java.io.File;

public class ElementoFactory {

    public static Elemento criarElemento(String nome) {

        File file = new File(nome);

        if (file.isFile()) {
            return new Arquivo(nome);
        } else if (file.isDirectory()) {
            return new Diretorio(nome);
        }

        return null;
    }
}
