package atv04;

public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Informe o nome de um arquivo ou diretório como argumento.");
            return;
        }

        String nome = args[0];
        Elemento elemento = ElementoFactory.criarElemento(nome);

        if (elemento != null) {
            long tamanho = elemento.tamanho();
            System.out.println("Tamanho: " + tamanho + " bytes");
        } else {
            System.out.println("O arquivo ou diretório não existe.");
        }
    }
}
