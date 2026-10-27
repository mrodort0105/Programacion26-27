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
public class Ejercicio27 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el nombre del cliente :");
        String nombre = scanner.nextLine();
        
        System.out.print("Introduce la edad del cliente :");
        int edad = scanner.nextInt();
        
        double precio = (edad < 12) ? 5 : (edad >= 65 ? 6 : 8);
        
        System.out.println("\nCliente: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Precio de la entrada: " + (int)precio + " €");

        scanner.close();
    }
}