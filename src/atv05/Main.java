package atv05;

public class Main {

    public static void main(String[] args) {

        Tabela tabela = new Tabela();
        Linha linha1 = new Linha();
        linha1.adicionar(new Celula("Texto1"));
        linha1.adicionar(new Celula("Texto2"));
        tabela.adicionar(linha1);

        Linha linha2 = new Linha();
        linha2.adicionar(new Celula("Texto3"));
        linha2.adicionar(new Celula("Texto4"));
        tabela.adicionar(linha2);

        tabela.imprimir();
    }
}