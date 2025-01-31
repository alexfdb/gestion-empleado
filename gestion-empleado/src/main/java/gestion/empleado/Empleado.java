package gestion.empleado;
import java.time.LocalDate;
import java.util.Objects;
/**
 * @author alexfdb
 * @version 1.0.0
 */
public abstract class Empleado {
    private String id;
    private String nombre;
    private LocalDate fechaNacimiento;
    private double salarioBase;

    /**
     * Constructor vacío
     */
    protected Empleado() {}

    /**
     * Constructor solo con ID
     * @param id
     */
    protected Empleado(String id) {
        this.id = id;
    }

    /**
     * Constructor completo
     * @param id
     * @param nombre
     * @param fechaNacimiento
     * @param salarioBase
     */
    protected Empleado(String id, String nombre, LocalDate fechaNacimiento, double salarioBase) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.salarioBase = salarioBase;
    }

    // Getters y Setters

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    /**
     * Calcula el salario final
     * @return el salario final
     */
    public abstract double calcularSalarioFinal();

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Empleado)) {
            return false;
        }
        Empleado empleado = (Empleado) o;
        return Objects.equals(id, empleado.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        int edad = LocalDate.now().getYear() - fechaNacimiento.getYear();
        return "Empleado [ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad + ", Salario: " + salarioBase + "]";
    }

}
