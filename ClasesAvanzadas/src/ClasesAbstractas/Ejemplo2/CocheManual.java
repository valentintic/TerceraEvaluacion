package ClasesAbstractas.Ejemplo2;

public class CocheManual extends Coche{
    private int velocidad;
    private static int marcha = 0;
    private static int CambioMarcha;

    public CocheManual(String modelo, int año, String marca, int cambioMarcha) {
        super(modelo, año, marca);
        marcha = cambioMarcha;
    }
    @Override
    void Moverse() {

    }
}
