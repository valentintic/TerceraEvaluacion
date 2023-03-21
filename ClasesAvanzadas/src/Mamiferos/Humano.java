package Mamiferos;

public class Humano extends Mamifero{
    @Override
    public String saludar() {
        System.out.println("El humano te dice hola");
        return "El humano te dice hola";
    }

}
