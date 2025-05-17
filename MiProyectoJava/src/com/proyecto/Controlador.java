package com.proyecto;

public class Controlador {
    public static void main(String[] args) {
        // Creamos dos funcionarios
        Funcionario funcionario1 = new Funcionario("Juan", "Pérez", 2500.00);
        Funcionario funcionario2 = new Funcionario("María", "Gómez", 3200.50);

        // Modificamos algunos datos
        funcionario1.setNombre("Juan Carlos");
        funcionario1.setApellido("Pérez López");
        funcionario1.setSalario(2750.75);

        funcionario2.setNombre("María Fernanda");
        funcionario2.setApellido("Gómez Ruiz");
        funcionario2.setSalario(3300.00);

        // Mostramos resultados por consola
        System.out.println("Funcionario 1:");
        System.out.println("  Nombre:   " + funcionario1.getNombre());
        System.out.println("  Apellido: " + funcionario1.getApellido());
        System.out.println("  Salario:  " + funcionario1.getSalario());

        System.out.println();

        System.out.println("Funcionario 2:");
        System.out.println("  Nombre:   " + funcionario2.getNombre());
        System.out.println("  Apellido: " + funcionario2.getApellido());
        System.out.println("  Salario:  " + funcionario2.getSalario());
    }
}
