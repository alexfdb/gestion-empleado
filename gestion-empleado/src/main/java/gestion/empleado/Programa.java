package gestion.empleado;
import java.time.LocalDate;
/**
 * @author alexfdb
 * @version 1.0.0
 */
public class Programa {
    public static void main(String[] args) {

        Empleado desarrollador = new Desarrollador("D001", "Carlos", LocalDate.of(1993, 5, 15), 3000.0);
        Empleado diseñador = new Diseñador("D002", "Ana", LocalDate.of(1995, 7, 22), 2500.0);
        Empleado gerente = new Gerente("G001", "Luis", LocalDate.of(1985, 3, 10), 5000.0);

        System.out.println("Empleado: Desarrollador");
        System.out.println(desarrollador);
        System.out.println("Salario Final: " + desarrollador.calcularSalarioFinal());
        System.out.println();

        System.out.println("Empleado: Diseñador");
        System.out.println(diseñador);
        System.out.println("Salario Final: " + diseñador.calcularSalarioFinal());
        System.out.println();

        System.out.println("Empleado: Gerente");
        System.out.println(gerente);
        System.out.println("Salario Final: " + gerente.calcularSalarioFinal());
    }
}