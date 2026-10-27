/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion;

/**
 *
 * @author 18_1DAW
 */
public class ContarFijo {
    public static void main(String[] args) {
        // Definimos el número hasta el cual queremos contar de forma fija
        int num = 10; 
        
        System.out.println("--- Contando hasta " + num + " ---");
        
        // Bucle 'for' para contar desde 1 hasta el número establecido
        for (int i = 1; i <= num; i++) {
            System.out.println("Número: " + i);
        }
        
        System.out.println("--- ¡Conteo finalizado! ---");
    }
}