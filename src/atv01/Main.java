package atv01;

public class Main {

    public static void main(String[] args) {

        SomadorExistente somadorExistente = new SomadorExistente();
        SomadorEsperado adaptador = new SomaAdapter(somadorExistente);
        Cliente cliente = new Cliente(adaptador);
        cliente.executar();

    }
}
