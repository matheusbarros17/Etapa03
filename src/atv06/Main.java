package atv06;

public class Main {

    public static void main(String[] args) {

        Persistencia persistenciaXML = new PersistenciaXML();
        Persistencia persistenciaJSON = new PersistenciaJSON();

        Cliente cliente = new Cliente("Matheus", "Rua Edson Brandão, 24", persistenciaXML);
        cliente.persiste();

        Produto produto = new Produto("Notebook", 3500.00, persistenciaJSON);
        produto.persiste();
    }
}
