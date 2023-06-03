package atv06;

public abstract class ClasseNegocio {

    protected Persistencia persistencia;

    public ClasseNegocio(Persistencia persistencia) {
        this.persistencia = persistencia;
    }

    public abstract void persiste();
}
