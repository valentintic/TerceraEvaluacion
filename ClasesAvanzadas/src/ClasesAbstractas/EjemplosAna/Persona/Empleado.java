package ClasesAbstractas.EjemplosAna.Persona;

import java.util.Date;

class Empleado extends Persona {
    protected Date fechaInicio;
    protected Long salario;
    public Empleado(String nombre, int añoNacimiento, String dirección, Date fechaInicio, Long salario) {
        super(nombre, añoNacimiento, dirección); /* invoca al constructor de la superclase */
        this.fechaInicio = fechaInicio;
        this.salario = salario;
    }
// getters y setters
// getters y setters
}
