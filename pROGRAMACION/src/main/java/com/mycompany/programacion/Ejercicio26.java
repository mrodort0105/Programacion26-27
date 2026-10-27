/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion;

/**
 *
 * @author 18_1DAW
 */
public class Ejercicio26 {

    public static void main(String[] args) {

        System.out.println("=== EXPRESIÓN 1 ===");
        // 1. 10 * 5 * 2 > 20 && 4 == 4
        boolean expr1 = 10 * 5 * 2 > 20 && 4 == 4;
        System.out.println("Resultado: " + expr1);
        System.out.println("Explicación de precedencia:");
        System.out.println(" 1. Aritméticos: '10 * 5 * 2' se evalúa de izquierda a derecha -> 50 * 2 = 100.");
        System.out.println(" 2. Relacionales: '100 > 20' es true. '4 == 4' es true.");
        System.out.println(" 3. Lógico: 'true && true' resulta en true.\n");


        System.out.println("=== EXPRESIÓN 2 ===");
        // 2. !((7 + 3) > 10) || 3 * 2 <= 0
        boolean expr2 = !((7 + 3) > 10) || 3 * 2 <= 0;
        System.out.println("Resultado: " + expr2);
        System.out.println("Explicación de precedencia:");
        System.out.println(" 1. Paréntesis y Aritméticos: '(7 + 3)' da 10. '3 * 2' da 6.");
        System.out.println(" 2. Relacionales: '10 > 10' es false. '6 <= 0' es false.");
        System.out.println(" 3. Operador NOT (!): '!(false)' se convierte en true.");
        System.out.println(" 4. Operador OR (||): 'true || false' resulta en true.\n");


        System.out.println("=== EXPRESIÓN 3 ===");
        // 3. 10 / 2 + 3 * 5 == 19 && true
        boolean expr3 = 10 / 2 + 3 * 5 == 19 && true;
        System.out.println("Resultado: " + expr3);
        System.out.println("Explicación de precedencia:");
        System.out.println(" 1. Multiplicación/División (*, /): '10 / 2' da 5. '3 * 5' da 15.");
        System.out.println(" 2. Suma (+): '5 + 15' da 20.");
        System.out.println(" 3. Igualdad (==): '20 == 19' es false.");
        System.out.println(" 4. Lógico (&&): 'false && true' resulta en false.\n");


        System.out.println("=== EXPRESIÓN 4 ===");
        // 4. int x = 5; x += 3 * 2;
        int x = 5;
        x += 3 * 2; // Equivalente a: x = x + (3 * 2)
        System.out.println("Resultado (valor de x): " + x);
        System.out.println("Explicación de precedencia:");
        System.out.println(" 1. Aritmético: '3 * 2' se evalúa primero por tener mayor precedencia -> 6.");
        System.out.println(" 2. Asignación compuesta (+=): 'x = 5 + 6' resulta en 11.\n");


        System.out.println("=== EXPRESIÓN 5 ===");
        // 5. boolean b = false; b = !b || 7 % 2 == 1;
        boolean b = false;
        b = !b || 7 % 2 == 1;
        System.out.println("Resultado (valor de b): " + b);
        System.out.println("Explicación de precedencia:");
        System.out.println(" 1. Módulo (%): '7 % 2' se evalúa primero -> resto 1.");
        System.out.println(" 2. NOT (!): '!b' es '!false' -> true.");
        System.out.println(" 3. Relacional (==): '1 == 1' -> true.");
        System.out.println(" 4. Lógico OR (||): 'true || true' -> true.");
        System.out.println(" 5. Asignación (=): Asigna true a la variable b.");
    }
}
