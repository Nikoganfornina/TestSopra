package org.example.Ejercicio2;

import java.util.Random;

public class ClasificacionPersonas {
    public static void main(String[] args) {
        Persona[] personas = new Persona[50];

        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            int sexo = random.nextInt(2) + 1;

            int edad = random.nextInt(100) + 1;

            personas[i] = new Persona(sexo, edad);
        }

        int mayoresEdad = 0;
        int menoresEdad = 0;
        int masculinosMayores = 0;
        int femeninasMenores = 0;
        int cantidadMujeres = 0;

        for (int i = 0; i < 50; i++) {
            Persona p = personas[i];

            if (p.edad >= 18) {
                mayoresEdad++;
            } else {
                menoresEdad++;
            }
            if (p.sexo == 1 && p.edad >= 18) {
                masculinosMayores++;
            }
            if (p.sexo == 2 && p.edad < 18) {
                femeninasMenores++;
            }
            if (p.sexo == 2) {
                cantidadMujeres++;
            }
        }

        double porcentajeMayores = (mayoresEdad / 50.0) * 100;
        double porcentajeMujeres = (cantidadMujeres / 50.0) * 100;

        System.out.println("\nResultados:");
        System.out.println("Cantidad de personas mayores de edad: " + mayoresEdad);
        System.out.println("Cantidad de personas menores de edad: " + menoresEdad);
        System.out.println("Cantidad de personas masculinas mayores de edad: " + masculinosMayores);
        System.out.println("Cantidad de personas femeninas menores de edad: " + femeninasMenores);
        System.out.println("Porcentaje de personas mayores de edad respecto al total: " + porcentajeMayores + "%");
        System.out.println("Porcentaje de mujeres respecto al total: " + porcentajeMujeres + "%");
    }
}


