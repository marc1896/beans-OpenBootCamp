package com.example;

public class GestorFacturas {
    //atributos
    Calculadora calculadora;
    String nombre;

    //constructores
    public GestorFacturas(Calculadora  calculadora, String nombre){
        System.out.println("Ejecutando constructor GestorFacturas");
        this.calculadora = calculadora;
    }

    //metodos
}
