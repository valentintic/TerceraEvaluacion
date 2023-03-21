package Empresa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Programador extends Empleado{
    private String[] lenguajes;
    public ArrayList<String> nuevosLenguajes;
    public Empleado empleado;
    public int añosDeExperiencia;


    public String[] getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(String[] lenguajes) {
        this.lenguajes = lenguajes;
    }

    public void añadirLenguaje(String lenguaje) {
        String[] nuevoArray = new String[lenguajes.length + 1];
        for (int i = 0; i < lenguajes.length; i++) {
            nuevoArray[i] = lenguajes[i];
        }

        // Añadimos el nuevo lenguaje al final del nuevo array
        nuevoArray[nuevoArray.length - 1] = lenguaje;

        // Asignamos el nuevo array al atributo lenguajes
        this.lenguajes = nuevoArray;
    }

    @Override
    public String toString() {
        if (getFechaInicio().isBefore(LocalDate.of(2021, 3, 16))) {
            return getNombre() + " que sabe: " + Arrays.toString(lenguajes) + ", y tiene " + (LocalDate.now().getYear() - getFechaInicio().getYear() + " años de Experiencia");
        }
        else {
            return getNombre() + " Tiene " + (LocalDate.now().getYear() - getFechaInicio().getYear()) + " Años de experiencia" ;
        }
    }

    public Programador() {
        this.lenguajes = lenguajes;
    }

    public Programador(String[] lenguajes, ArrayList<String> nuevosLenguajes) {
        getFechaInicio();
        this.lenguajes = lenguajes;
        this.añosDeExperiencia = añosDeExperiencia;

    }


}
