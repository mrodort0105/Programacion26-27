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

public class BeneficiosFruteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PRECIO_MANZANA = 2.35;
        final double PRECIO_PERA = 1.95;

        System.out.print("Ventas de manzanas en el 1er semestre (kg): ");
        double manzanasSemestre1 = scanner.nextDouble();

        System.out.print("Ventas de manzanas en el 2º semestre (kg): ");
        double manzanasSemestre2 = scanner.nextDouble();

        System.out.print("Ventas de peras en el 1er semestre (kg): ");
        double perasSemestre1 = scanner.nextDouble();

        System.out.print("Ventas de peras en el 2º semestre (kg): ");
        double perasSemestre2 = scanner.nextDouble();

        // Operador +
        double totalKilosManzanas = manzanasSemestre1 + manzanasSemestre2;
        double totalKilosPeras = perasSemestre1 + perasSemestre2;

        // Operador *
        double importeManzanas = totalKilosManzanas * PRECIO_MANZANA;
        double importePeras = totalKilosPeras * PRECIO_PERA;
        double importeTotal = importeManzanas + importePeras;

        // Operadores / y % 
        double promedioPorSemestre = importeTotal / 2;
        double restoDivision = importeTotal % 2;

        System.out.println("Importe total de beneficios: " + importeTotal + "$");
        System.out.println("Promedio por semestre (/): " + promedioPorSemestre + "$");
        System.out.println("Resto de la división entre 2 (%): " + restoDivision);

        scanner.close();
    }
}
