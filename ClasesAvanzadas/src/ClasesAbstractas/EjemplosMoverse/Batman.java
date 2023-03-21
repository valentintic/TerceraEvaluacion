package ClasesAbstractas.EjemplosMoverse;

public class Batman implements Mover {
private static int x = 0;
private static int y = 0;
private static int girosIzquierda;
private static int girosDerecha;
private String direccion;



    public static int getX() {
        return x;
    }
    public static int getY() {
        return y;
    }

    protected String Posicion;
    private String posicion;

    public static String getPosicion() {
        return "X: " + x + ", Y: " + y;
    }

    @Override
    public void pasoAdelante(String direccion) {
    if (girosIzquierda > girosDerecha) {
        masGirosIzquierda(direccion);
    } else {
        masGirosDerecha(direccion);
    }
        Posicion = "X: " + x + ", Y: " + y;

    }

    private void masGirosIzquierda(String direccion) {
        if (girosIzquierda - girosDerecha == 0 || (girosIzquierda - girosDerecha % 4)  == 0) {
            x++;
            this.direccion = "Derecha";
        } else if ((girosIzquierda - girosDerecha) % 4 == 1  || girosIzquierda - girosDerecha == 1){
            y++;
            this.direccion = "Arriba";
        } else if ((girosIzquierda - girosDerecha) % 4 ==  2 || girosIzquierda - girosDerecha == 2) {
            x--;
            this.direccion = "Izquierda";
        } else if ((girosIzquierda - girosDerecha) % 4 == 3 || girosIzquierda - girosDerecha == 3) {
            y--;
            this.direccion = "Abajo";
        }
    }

    private void masGirosDerecha(String direccion) {
        if (girosIzquierda - girosDerecha == 0 || (girosIzquierda - girosDerecha % 4)  == 0) {
            x++;
            this.direccion = "Derecha";
            System.out.println("Avanza hacia la derecha");
        } else if ((girosDerecha - girosIzquierda) % 4 == 1  || girosDerecha - girosIzquierda == 1){
            y--;
            this.direccion = "Abajo";
            System.out.println("Avanza hacia abajo");
        } else if ((girosDerecha - girosIzquierda) % 4 ==  2 || girosDerecha - girosIzquierda == 2) {
            x--;
            this.direccion = "Izquierda";
            System.out.println("Avanza hacia la izquierda");
        } else if ((girosDerecha - girosIzquierda) % 4 == 3 || girosDerecha - girosIzquierda == 3) {
            y++;
            this.direccion = "Arriba";
            System.out.println("Avanza hacia arriba");
        }
    }

    @Override
    public void darseVuelta() {
        girarDerecha();
        girarDerecha();
    }

    @Override
    public void girarIzquierda() {
        girosIzquierda++;
    }

    @Override
    public void girarDerecha() {
        girosDerecha++;
    }

    public void imprimir() {
        System.out.println("La posicion de batman es:  " + Posicion);
    }
}
