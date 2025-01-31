# Sistema de Gestión de Empleados

Este proyecto implementa un sistema de gestión de empleados que permite crear y gestionar diferentes tipos de empleados como **Desarrolladores**, **Diseñadores**, y **Gerentes**. Cada tipo de empleado tiene un bono diferente sobre su salario base y un método específico para calcular su salario final.

## Estructura del Proyecto

El proyecto está compuesto por las siguientes clases:

### 1. `Empleado` (Clase abstracta)
- **Atributos**:
  - `id` (String)
  - `nombre` (String)
  - `fechaNacimiento` (LocalDate)
  - `salarioBase` (double)
- **Métodos**:
  - `calcularSalarioFinal()` (Método abstracto para calcular el salario final de cada tipo de empleado)
  - `toString()` (Devuelve un String con la información del empleado, incluyendo la edad calculada)
  - `equals()` y `hashCode()` (Para comparar empleados por su ID)

### 2. Subclases de `Empleado`
#### a. `Desarrollador`
- **Bono**: 20% sobre el salario base.
- **Método sobrescrito**: `calcularSalarioFinal()`
  
#### b. `Diseñador`
- **Bono**: 10% sobre el salario base.
- **Método sobrescrito**: `calcularSalarioFinal()`

#### c. `Gerente`
- **Bono**: 30% sobre el salario base.
- **Método sobrescrito**: `calcularSalarioFinal()`

### 3. Clase `Programa`
- **Objetivo**: Crear instancias de cada tipo de empleado (Desarrollador, Diseñador y Gerente), y mostrar su información incluyendo el salario final calculado.
