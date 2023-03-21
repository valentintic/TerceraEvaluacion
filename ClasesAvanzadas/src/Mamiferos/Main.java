package Mamiferos;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Mamifero> animales = new ArrayList<>();

        Mamifero gato = new Gato();
        gato.saludar();

        Mamifero Humano = new Humano();
        Humano.saludar();

        Mamifero delfin = new Mamifero();
        delfin.saludar();

        System.out.println("Aqui");

        animales.add(gato);
        animales.add(Humano);
        animales.add(delfin);


        for (Mamifero animal: animales) {
            animal.saludar();
        }
    }

}
