package Tema2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 18_1DAW
 */
import java.util.Scanner;

public class CalificacionNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Solicitar y leer la nota numérica.
        System.out.print("Introduce la nota numérica (0 a 10): ");
        double nota = scanner.nextDouble();

        // 2. Evaluar la nota.
        if (nota < 0 || nota > 10) {
            // Manejo de errores si la nota está fuera del rango 0-10
            System.out.println("Error: La nota debe estar entre 0 y 10.");
        } 
        // Evaluamos los rangos de forma descendente:
        else if (nota >= 9) {
            // 9-10
            System.out.println("La calificación es: Sobresaliente");
        } 
        else if (nota >= 7) {
            // 7-8
            System.out.println("La calificación es: Notable");
        } 
        else if (nota >= 6) {
            // 6
            System.out.println("La calificación es: Bien");
        } 
        else if (nota >= 5) {
            // 5
            System.out.println("La calificación es: Suficiente");
        } 
        else {
            // 0-4 (Si llega aquí, la nota es >= 0 y < 5)
            System.out.println("La calificación es: Insuficiente");
        }

        // Cierre del scanner
        scanner.close();
    }
}