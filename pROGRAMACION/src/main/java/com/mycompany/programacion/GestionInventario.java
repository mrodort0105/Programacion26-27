/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion;

/**
 *
 * @author 18_1DAW
 */
public class GestionInventario {
    public static void main(String[] args) {
        int pociones = 0;
        double precioPocion = 15.0;
        boolean mochilaLlena = false;
        double oro = 100.0;
        double importe = 3 * precioPocion;

        oro = oro - importe;
        pociones = pociones + 3;
        mochilaLlena = true;
        System.out.println("Importe total: " + importe);
        System.out.println("Oro restante: " + oro);
        System.out.println("Pociones: " + pociones);
        System.out.println("Mochila llena: " + mochilaLlena);
    }
}
