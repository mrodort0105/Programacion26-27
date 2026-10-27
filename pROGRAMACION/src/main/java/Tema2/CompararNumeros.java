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

public class CompararNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir dos números
        System.out.print("Primer número: ");
        double a = scanner.nextDouble();
        
        System.out.print("Segundo número: ");
        double b = scanner.nextDouble();
        
        // Comparación:
        if (a > b) {
            System.out.println("El mayor es " + a);
        } else if (b > a) {
            System.out.println("El mayor es " + b);
        } else {
            System.out.println("Son iguales");
        }
        
        scanner.close();
    }
}