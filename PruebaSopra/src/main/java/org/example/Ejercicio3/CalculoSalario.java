package org.example.Ejercicio3;

import java.util.Scanner;

public class CalculoSalario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese las horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();

        System.out.print("Ingrese la tarifa por hora: ");
        double tarifa = scanner.nextDouble();

        double salario;
        if (horasTrabajadas > 40) {

            int horasExtras = horasTrabajadas - 40;

            salario = (40 * tarifa) + (horasExtras * tarifa * 1.5);

        } else {
            salario = horasTrabajadas * tarifa;
        }

        System.out.println("El salario del trabajador es: " + salario);


    }
}
