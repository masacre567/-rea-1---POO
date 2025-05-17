package com.proyecto;

public class Funcionario extends Persona {
    private double salario;

    public Funcionario(String nombre, String apellido, double salario) {
        super(nombre, apellido);
        this.salario = salario; // Declarar atributos
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
