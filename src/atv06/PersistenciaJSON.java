package atv06;

public class PersistenciaJSON implements Persistencia {

    @Override
    public void persisteObjeto(String mensagem) {
        System.out.println("Persistindo em JSON: " + mensagem);
    }
}
