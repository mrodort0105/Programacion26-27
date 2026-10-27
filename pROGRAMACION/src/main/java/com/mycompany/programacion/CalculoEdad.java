/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion;

import java.util.Scanner;

public class CalculoEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el año actual: ");
        int anioActual = scanner.nextInt();

        System.out.print("Introduce tu año de nacimiento: ");
        int anioNacimiento = scanner.nextInt();

        int edad = anioActual - anioNacimiento;

        System.out.println("Tu edad es: " + edad + " años.");

        scanner.close();
    }
}