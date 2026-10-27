/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema2;

/**
 *
 * @author 18_1DAW
 */
import java.util.Scanner;

public class ComprobarParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Solicitar y leer el número entero.
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        // 2. Evaluar el módulo (resto) de la división por 2.
        if (numero % 2 == 0) {
            // Si el resto es 0, es par.
            System.out.println("El número " + numero + " es PAR.");
        } else {
            // Si el resto no es 0, es impar.
            System.out.println("El número " + numero + " es IMPAR.");
        }

        // Cierre del scanner
        scanner.close();
    }
}
