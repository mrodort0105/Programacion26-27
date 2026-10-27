/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema2;

/**
 *
 * @author 18_1DAW
 */
public class SumaInversa {
    public static void main(String[] args) {
        int suma = 0;
        
        for (int i = 100; i >= 1; i--) {
            suma += i;
        }
        
        System.out.println("La suma desde el 100 al 1 es: " + suma);
    }
}
