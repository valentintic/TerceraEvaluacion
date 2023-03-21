package Empresa;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Programador programador = getProgramador();
        Programador programador1 = new Programador();
        programador1.setNombre("Pepe");
        programador1.setAñoNacimineto(2004);
        programador1.setSalario((long) 1800);
        programador1.setDireccion("Gran Via, 72");
        programador1.setFechaInicio(LocalDate.of(2022, 3, 24));

        String[] lenguajes = {"Python" , "C++", "C#"};
        programador1.setLenguajes(lenguajes);

        Imprimir(programador);
        Imprimir2(programador1);


    }

    private static void Imprimir(Programador programador) {
        System.out.println(programador.getNombre() + ", " + programador.getDireccion()
                + " " + programador.getFechaInicio() + ", " + Arrays.toString(programador.getLenguajes()) + ", "
                + programador.getSalario() + ", " + programador.getAñoNacimineto());


        System.out.println(programador.toString());
    }
    private static void Imprimir2(Programador programador1) {
        System.out.println(programador1.getNombre() + ", " + programador1.getDireccion()
                + " " + programador1.getFechaInicio() + ", " + Arrays.toString(programador1.getLenguajes()) + ", "
                + programador1.getSalario() + ", " + programador1.getAñoNacimineto());


        System.out.println(programador1.toString());
    }


    private static Programador getProgramador() {
        Programador programador = new Programador();
        AsignarValores(programador);
        Lenguajes(programador);
        return programador;
    }

    private static void Lenguajes(Programador programador) {
        String [] lenguajes = {"Java" , "JavaScript", "Python"};
        programador.setLenguajes(lenguajes);
        programador.añadirLenguaje("Css");
        programador.añadirLenguaje("Html");
        programador.añadirLenguaje("C#");
        programador.añadirLenguaje("C");
    }

    private static void AsignarValores(Programador programador) {
        programador.setNombre("Valentin");
        programador.setAñoNacimineto(2001);
        programador.setSalario((long) 2100.0);
        programador.setDireccion("Gran Via, 72");
        programador.setFechaInicio(LocalDate.of(2018, 3, 24));
    }

}
