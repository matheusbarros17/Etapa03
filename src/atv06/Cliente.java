package atv06;

public class Cliente extends ClasseNegocio {

    private String nome;
    private String endereco;

    public Cliente(String nome, String endereco, Persistencia persistencia) {
        super(persistencia);
        this.nome = nome;
        this.endereco = endereco;
    }

    @Override
    public void persiste() {
        String mensagem = this.toString();
        persistencia.persisteObjeto(mensagem);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
