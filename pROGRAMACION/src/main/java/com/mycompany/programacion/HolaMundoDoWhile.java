/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion;

/**
 *
 * @author 18_1DAW
 */
public class HolaMundoDoWhile {
    public static void main(String[] args) {
        int i = 1; // Contador inicial

        // El bloque de código se ejecuta al menos una vez, y se repite mientras 'i' sea menor o igual a 100
        do {
            System.out.println(i + ". Hola Mundo");
            i++; // Incrementamos el contador en 1 en cada iteración
        } while (i <= 100);
    }
}