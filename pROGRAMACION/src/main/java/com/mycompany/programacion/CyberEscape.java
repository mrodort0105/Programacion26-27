/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion;

import java.util.Scanner;

/**
 *
 * @author 18_1DAW
 */
public class CyberEscape {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Estado del jugador y del juego
        int vida = 100;
        boolean tieneLlaves = false;
        boolean servidorDesbloqueado = false;
        boolean partidaActiva = true;
        int intentosHackeo = 0;

        // FASE 2: Bucle general de juego con while que mantiene la partida activa hasta ganar o perder[cite: 1]
        while (partidaActiva) {
            System.out.println("\n----------------------------------");
            System.out.println("ESTADO -> Vida: " + vida + "HP | Llaves: " + (tieneLlaves ? "Sí" : "No"));
            System.out.println("----------------------------------");
            System.out.println("¿Qué deseas hacer?");
            System.out.println("1. Explorar sala en busca de recursos");
            System.out.println("2. Revisar inventario y estado");
            System.out.println("3. Hackear puerta del servidor central");
            System.out.println("0. Salir del juego");
            System.out.print("Selecciona una opción: ");

            int opcion = -1;
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
            } else {
                System.out.println("¡Entrada inválida! Introduce un número.");
                scanner.next(); // Limpiar buffer de entrada errónea
                continue;
            }

            // FASE 1: Menú principal mediante switch
            switch (opcion) {
                case 1:
                    // FASE 1: Toma de decisiones contextuales con if / else / else if
                    System.out.println("\nExplorando los terminales abandonados...");
                    int hallazgo = (int) (Math.random() * 3); // Valor aleatorio 0, 1 o 2
                    
                    if (hallazgo == 0) {
                        System.out.println("No has encontrado nada");
                    } else if (hallazgo == 1 && !tieneLlaves) {
                        System.out.println("¡Eureka! Has encontrado las [Llaves de Encriptación].");
                        tieneLlaves = true;
                    } else {
                        System.out.println("La sala está despejada, pero el malware te ha emitido una descarga estática. Pierdes 10 de vida.");
                        vida -= 10;
                    }
                    break;

                case 2:
                    System.out.println("\n--- INVENTARIO Y REGISTRO ---");
                    
                    String[] items = {"Tarjeta de Acceso", tieneLlaves ? "Llaves de Encriptación (Obtenidas)" : "Llaves (No encontradas)", "Kit de Depuración"};
                    for (int i = 0; i < items.length; i++) {
                        System.out.println("- Elemento [" + (i + 1) + "]: " + items[i]);
                    }
                    System.out.println("Vida actual: " + vida + "/100");
                    break;

                case 3:
                    // Hackeo de la puerta principal
                    System.out.println("\nIniciando secuencia de hackeo...");
                    
                    
                    if (!tieneLlaves) {
                        System.out.println("¡Acceso denegado! La puerta de seguridad requiere las 'Llaves de Encriptación'. Explora la sala.");
                        break;
                    }

                    intentosHackeo++;
                    
                  
                    
                    boolean hackeoExitoso = true;
                 
                    for (int porcentaje = 10; porcentaje <= 100; porcentaje += 25) {
                        System.out.println("Progreso de hackeo: " + porcentaje + "%...");
                        
                        
                        if (porcentaje == 50 && Math.random() > 0.4) {
                            System.out.println("¡Alerta! Firewall activo detectado. El sistema intenta bloquearte.");
                            System.out.print("¿Deseas huir del hackeo para evitar daños? (s/n): ");
                            String decisionHuir = scanner.next();
                            
                            if (decisionHuir.equalsIgnoreCase("s")) {
                                System.out.println("¡Has abortado el hackeo a tiempo para huir!");
                                hackeoExitoso = false;
                                break; 
                            } else {
                                System.out.println("¡Forzando el sistema a pesar del riesgo!");
                            
                            }
                        }
                    }

                    if (hackeoExitoso) {
                        System.out.println("\n¡Felicidades! Has hackeado el servidor central con éxito.");
                        servidorDesbloqueado = true;
                        partidaActiva = false;
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del terminal de juego. ¡Hasta pronto!");
                    partidaActiva = false;
                    break;

                default:
                    System.out.println("Opción no válida. Introduce un número entre 0 y 3.");
                    break;
            }

            // Comprobación de condición de derrota (Game Over)
            if (vida <= 0) {
                System.out.println("\n==================================================");
                System.out.println("   ¡GAME OVER! Tu vida ha llegado a 0. El malware te ha atrapado.");
                System.out.println("==================================================");
                partidaActiva = false;
            }
        }

        // Mensaje final de victoria si se completó el hackeo
        if (servidorDesbloqueado) {
            System.out.println("\n==================================================");
            System.out.println("   ¡VICTORIA! Has escapado de la terminal y salvado el servidor[cite: 1].");
            System.out.println("==================================================");
        }

        
    }
}
            