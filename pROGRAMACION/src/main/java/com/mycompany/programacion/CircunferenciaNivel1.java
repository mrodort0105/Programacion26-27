/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion;

import java.util.Scanner;

public class CircunferenciaNivel1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14;

        System.out.print("Introduce el radio de la circunferencia: ");
        double radio = scanner.nextDouble();

        double longitud = 2 * PI * radio;
        double area = PI * radio * radio;

        System.out.println("Longitud: " + longitud);
        System.out.println("Área: " + area);

        scanner.close();
    }
}
