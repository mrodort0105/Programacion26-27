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

public class CalificacionEjercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Solicitar y leer la nota numérica
        System.out.print("Introduce una nota numérica (0 a 10): ");
        double nota = scanner.nextDouble();

        // 2. Evaluar la calificación según la escala
        if (nota < 0 || nota > 10) {
            System.out.println("Error: La nota debe estar entre 0 y 10.");
        } else if (nota >= 9) {
            System.out.println("Calificación: Sobresaliente");
        } else if (nota >= 7) {
            System.out.println("Calificación: Notable");
        } else if (nota >= 6) {
            System.out.println("Calificación: Bien");
        } else if (nota >= 5) {
            System.out.println("Calificación: Suficiente");
        } else {
            System.out.println("Calificación: Insuficiente");
        }

        scanner.close();
    }
}