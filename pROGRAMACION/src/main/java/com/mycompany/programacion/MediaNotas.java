/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la primera nota (entera): ");
        int nota1 = scanner.nextInt();

        System.out.print("Introduce la segunda nota (entera): ");
        int nota2 = scanner.nextInt();

        double media = (nota1 + nota2) / 2.0;

        System.out.println("La media aritmética es: " + media);

        scanner.close();
    }
}