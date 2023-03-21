package ClasesAbstractas.Ejemplo2;

public class CocheAutomatico extends Coche {
    private int velocidad;
    private boolean acceleracion;

    public void setAcceleracion(boolean acceleracion) {
        this.acceleracion = acceleracion;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public CocheAutomatico(String modelo, int año, String marca) {
        super(modelo, año, marca);
        this.velocidad = velocidad;
        this.acceleracion = acceleracion;
    }

    @Override
    void Moverse() {
        if (acceleracion) {
            System.out.println("El coche esta accelerando");
        } else if (!acceleracion) {
            System.out.println("El coche esta frenando");
        } else {
            System.out.println("El coche no esta en movimiento");
        }
    }
}
