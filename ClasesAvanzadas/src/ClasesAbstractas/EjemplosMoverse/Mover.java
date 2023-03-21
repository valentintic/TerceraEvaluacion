package ClasesAbstractas.EjemplosMoverse;

public interface Mover {
    void pasoAdelante(String direccion);
    void girarIzquierda();
    void girarDerecha();
    default void darseVuelta() {
        girarIzquierda();
        girarIzquierda();
    }
}
