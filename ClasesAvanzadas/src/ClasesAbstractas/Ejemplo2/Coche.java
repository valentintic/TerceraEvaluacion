package ClasesAbstractas.Ejemplo2;

public abstract class Coche {
    protected String modelo;
    protected int año;
    protected String marca;
    public int acceleracion;

    abstract void Moverse();

    public Coche(String modelo, int año, String marca) {
        this.modelo = modelo;
        this.año = año;
        this.marca = marca;
    }
}
