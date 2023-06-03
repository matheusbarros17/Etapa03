package atv06;

public class PersistenciaXML implements Persistencia {

    @Override
    public void persisteObjeto(String mensagem) {
        System.out.println("Persistindo em XML: " + mensagem);
    }
}
