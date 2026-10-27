/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion;

/**
 *
 * @author 18_1DAW
 */
import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Mostrar menú de opciones
        System.out.println("=== CALCULADORA BÁSICA ===");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("Selecciona una opción (1-4): ");
        int opcion = scanner.nextInt();

        // 2. Solicitar los dos números para operar
        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        // 3. Realizar la operación según la opción elegida
        switch (opcion) {
            case 1:
                double suma = num1 + num2;
                System.out.println("Resultado de la suma: " + suma);
                break;
            case 2:
                double resta = num1 - num2;
                System.out.println("Resultado de la resta: " + resta);
                break;
            case 3:
                double multiplicacion = num1 * num2;
                System.out.println("Resultado de la multiplicación: " + multiplicacion);
                break;
            case 4:
                if (num2 != 0) {
                    double division = num1 / num2;
                    System.out.println("Resultado de la división: " + division);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            default:
                System.out.println("Opción no válida. Por favor, selecciona un número entre 1 y 4.");
                break;
        }

        scanner.close();
    }
}
