package ClasesAbstractas.Herramientas;

public class Lapiz extends Herramienta implements Dibujable {
    public Lapiz(int grosor, String color) {
        super(grosor, color);
    }
    public void dibujarRecta() {
        System.out.println("Dibujando una recta con el lapiz");
    }
    public void dibujarCurva() {
        System.out.println("Dibujando una curva con el lapiz");
    }
    public void dibujarLibre() {
        System.out.println("Dibujo libre con el lapiz");
    }


}
