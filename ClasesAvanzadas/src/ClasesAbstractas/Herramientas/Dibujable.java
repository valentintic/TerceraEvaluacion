package ClasesAbstractas.Herramientas;

public interface Dibujable {
    void dibujarRecta();
    void dibujarCurva();
    void dibujarLibre();

}

interface Interfaz {
    default void Acción() {
        System.out.println("Acción");
    }
}

class Clase implements Interfaz {

}

class main {
    public static void main(String[] args) {
        Clase c = new Clase();
        c.Acción();
    }
}

