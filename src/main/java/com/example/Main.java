package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //Concepto 1 : como obtener beans de Spring

        // Opción 1. Crear un objeto de forma general
        //Calculadora service = new Calculadora();

        // 2. Recibir un objeto de Spring
        Calculadora calculadora = (Calculadora)context.getBean("calculadora");

        // Se puede volver a obtener
        // OJO: se recupera el mismo objeto
        Calculadora calculadora2 = (Calculadora)context.getBean("calculadora");

        String texto = calculadora.holaMundo();
        System.out.println(texto);

        texto = calculadora2.holaMundo();
        System.out.println(texto);

        //Concepto 2: cargar un bean dentro de otro bean
        GestorFacturas gestor = (GestorFacturas) context.getBean("gestorFacturas");
        System.out.println(gestor.calculadora.holaMundo());

        //Concepto 3: scope o alcance
        //los beans por defecto son singleton, se crea el objeto y se reutiliza para toda la aplicación
        //podemos cambiarlo a scope="prototype" si queremos que se cree un nuevo objeto cada vez
        //verificarlo viendo como se ejecuta varias veces un constructor
    }
}
