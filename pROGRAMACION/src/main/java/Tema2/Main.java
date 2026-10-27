/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema2;

/**
 *
 * @author 18_1DAW
 */

public class Main {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        
        // Preguntamos el usuario
        System.out.print("Introduce tu nombre de usuario: ");
        String nombre = "Fran";
        final String USUARIO_CORRECTO = "Fran";
        
        // Si el usuario es correcto nos dará la bienvenida
        if (nombre == USUARIO_CORRECTO) {
            System.out.println("Bienvenido Miguel");
        } 
        // Si el usuario es incorrecto nos lo dirá y sale del programa
        else {
            System.out.println("Usuario incorrecto, nos vemos luego");
        }
        
    }
}