package ClasesAbstractas.EjemplosMoverse;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Batman batman = new Batman();
        for (int i = 0; i < 10; i++) {
            batman.girarIzquierda();
        }

        for (int i = 0; i < 8 ; i++) {
            batman.girarDerecha();
        }
        MoverABatman(batman);
        Batman.getPosicion();
    }

    private static void MoverABatman(Batman batman) {
        String movimiento = sc.nextLine();
        do {
            if (movimiento.equalsIgnoreCase("w")) {
            }
        } while (movimiento.equalsIgnoreCase("w") || movimiento.equalsIgnoreCase("a") || movimiento.equalsIgnoreCase("s") || movimiento.equalsIgnoreCase("d"));
    }
}
