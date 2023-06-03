package atv04;

import java.io.File;

public class Diretorio extends Elemento {

    private File directory;

    public Diretorio(String nome) {
        directory = new File(nome);
    }

    @Override
    long tamanho() {
        long totalSize = 0;
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    totalSize += file.length();
                } else if (file.isDirectory()) {
                    Diretorio subdiretorio = new Diretorio(file.getAbsolutePath());
                    totalSize += subdiretorio.tamanho();
                }
            }
        } else {
            System.out.println("Não foi possível computar o tamanho de " + directory.getAbsolutePath());
        }

        return totalSize;
    }
}