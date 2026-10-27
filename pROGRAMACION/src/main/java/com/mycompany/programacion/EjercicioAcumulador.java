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

public class EjercicioAcumulador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        
        System.out.print("Introduce un número (0 para salir): ");
        int numero = scanner.nextInt();
        
        while (numero != 0) {
            suma += numero;
            System.out.print("Introduce otro número (0 para salir): ");
            numero = scanner.nextInt();
        }
        
        System.out.println("La suma total es: " + suma);
        scanner.close();
    }
}
