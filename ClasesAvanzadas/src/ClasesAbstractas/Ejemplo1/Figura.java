package ClasesAbstractas.Ejemplo1;

public abstract class Figura {
    private String color;

    public Figura(String color)
    {
        this.color = color;
    }

    public abstract double calcularArea();

    public String getColor()
    {
        return color;
    }
}
