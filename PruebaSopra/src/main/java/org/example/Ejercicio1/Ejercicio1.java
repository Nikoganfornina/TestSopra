package org.example.Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");

        numero = scanner.nextInt();
        if (numero % 2 == 0) {

            System.out.println("El número es par. Los números pares descendientes son:");

            for (int i = numero; i >= 0; i -= 2) {
                System.out.println(i);
            }
        } else {
            System.out.println("El número es impar. Los números impares descendientes son:");
            for (int i = numero; i >= 1; i -= 2) {
                System.out.println(i);
            }
        }

    }
}

