/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion;

/**
 *
 * @author 18_1DAW
 */
public class HolaMundoRepetirHasta {
    public static void main(String[] args) {
        int i = 1; // Contador inicial

        // Estructura equivalente a "Repetir ... Hasta que i sea mayor a 100"
        do {
            System.out.println(i + ". Hola Mundo");
            i++; 
        } while (!(i > 100)); // El '!' significa negación: se repite HASTA QUE i > 100 sea verdadero
    }
}
