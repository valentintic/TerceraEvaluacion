import java.util.*;

public class Main {
    public static void main(String[] args) {
        char[][] mapa = new char[15][15];

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                mapa[i][j] = '0';
            }
        }

        int batmanX = 7; // el índice del centro en el eje X
        int batmanY = 7; // el índice del centro en el eje Y

        mapa[batmanX][batmanY] = 'X';

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.print(mapa[i][j] + " ");
            }
            System.out.println();
        }


    }
}