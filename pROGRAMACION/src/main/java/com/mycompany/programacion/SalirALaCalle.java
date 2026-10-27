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

public class SalirALaCalle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Está lloviendo? (true/false): ");
        boolean llueve = scanner.nextBoolean();

        System.out.print("¿Has terminado la tarea? (true/false): ");
        boolean tareaHecha = scanner.nextBoolean();

        System.out.print("¿Tienes que ir a la biblioteca? (true/false): ");
        boolean irBiblioteca = scanner.nextBoolean();

        boolean podemosSalir = irBiblioteca || (!llueve && tareaHecha);

        System.out.println("¿Puedes salir a la calle?: " + podemosSalir);

        scanner.close();
    }
}
