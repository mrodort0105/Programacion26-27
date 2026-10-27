/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion;

/**
 *
 * @author 18_1DAW
 */
public class CalculoDescuento {
    public static void main(String[] args) {
        double precioOriginal = 120.0;
        final double DESCUENTO = 0.15;

        double precioFinal = precioOriginal - (precioOriginal * DESCUENTO);

        System.out.println("Precio original: " + precioOriginal + " créditos");
        System.out.println("Precio final con descuento: " + precioFinal + " créditos");
    }
}
