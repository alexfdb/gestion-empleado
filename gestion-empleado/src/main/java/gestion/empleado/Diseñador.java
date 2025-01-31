package gestion.empleado;
import java.time.LocalDate;
/**
 * @author alexfdb
 * @version 1.0.0
 */
public class Diseñador extends Empleado{
    
    private static final double BONO_PORCENTAJE = 0.10;

    /**
     * Constructor completo
     * @param id
     * @param nombre
     * @param fechaNacimiento
     * @param salarioBase
     */
    public Diseñador(String id, String nombre, LocalDate fechaNacimiento, double salarioBase) {
        super(id, nombre, fechaNacimiento, salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() + (getSalarioBase() * BONO_PORCENTAJE);
    }
}
