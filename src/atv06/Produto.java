package atv06;

public class Produto extends ClasseNegocio {

    private String nome;
    private double preco;

    public Produto(String nome, double preco, Persistencia persistencia) {
        super(persistencia);
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public void persiste() {
        String mensagem = this.toString();
        persistencia.persisteObjeto(mensagem);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
