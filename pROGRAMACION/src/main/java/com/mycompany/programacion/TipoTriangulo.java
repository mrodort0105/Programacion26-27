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

public class TipoTriangulo {

    // Método para determinar el tipo de triángulo
    public static String determinarTipoTriangulo(double a, double b, double c) {
        // 1. Verificar la condición de existencia del triángulo
        if (!(a + b > c && a + c > b && b + c > a)) {
            return "Los lados NO forman un triángulo válido.";
        }
        
        // 2. Determinar el tipo de triángulo
        if (a == b && b == c) {
            return "El triángulo es Equilátero.";
        } else if (a == b || a == c || b == c) {
            return "El triángulo es Isósceles.";
        } else {
            return "El triángulo es Escaleno.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese la longitud del primer lado (a): ");
        double lado1 = scanner.nextDouble();

        System.out.print("Ingrese la longitud del segundo lado (b): ");
        double lado2 = scanner.nextDouble();

        System.out.print("Ingrese la longitud del tercer lado (c): ");
        double lado3 = scanner.nextDouble();

        // Validar que los lados sean positivos
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            System.out.println("Las longitudes de los lados deben ser números positivos.");
        } else {
            // Llamar al método y mostrar el resultado
            String resultado = determinarTipoTriangulo(lado1, lado2, lado3);
            System.out.println("\nResultado: " + resultado);
        }

        scanner.close();
    }
}
