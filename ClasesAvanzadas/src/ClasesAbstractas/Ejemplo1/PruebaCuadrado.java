package ClasesAbstractas.Ejemplo1;

import java.util.Scanner;

public class PruebaCuadrado
{
    public static void main(String[] args)
    {
        String colorDelCuadrado;
        double ladoDelCuadrado;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el color del cuadrado: ");
        colorDelCuadrado = teclado.nextLine();

        System.out.print("Introduzca el lado del cuadrado: ");
        ladoDelCuadrado = teclado.nextDouble();

        Cuadrado cuadrado1 = new Cuadrado(colorDelCuadrado, ladoDelCuadrado);

        System.out.printf("El área del cuadrado %s es: %f", cuadrado1.getColor(), cuadrado1.calcularArea());
    }
    public static class PruebaTriangulo
    {
        public static void main(String[] args)
        {
            String colorDelTriangulo;
            double baseDelTriangulo;
            double alturaDelTriangulo;

            Scanner teclado = new Scanner(System.in);

            System.out.print("Introduzca el color del triángulo: ");
            colorDelTriangulo = teclado.nextLine();

            System.out.print("Introduzca la base del triángulo: ");
            baseDelTriangulo = teclado.nextDouble();

            System.out.print("Introduzca la altura del triángulo: ");
            alturaDelTriangulo = teclado.nextDouble();

            Triangulo triangulo1 = new Triangulo(colorDelTriangulo, baseDelTriangulo, alturaDelTriangulo);

            System.out.printf("El área del triángulo %s es: %f", triangulo1.getColor(), triangulo1.calcularArea());
        }
    }
}
