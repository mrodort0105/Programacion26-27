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

public class AnioBisiesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Solicitar y leer el año
        System.out.print("Introduce un año (ej: 2024): ");
        int anio = scanner.nextInt();

        // 2. Aplicar la lógica del año bisiesto
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
            System.out.println("El año " + anio + " ES bisiesto.");
        } else {
            System.out.println("El año " + anio + " NO es bisiesto.");
        }

        scanner.close();
    }
}
