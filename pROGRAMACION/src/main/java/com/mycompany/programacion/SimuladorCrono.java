/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion;

/**
 *
 * @author 18_1DAW
 */
public class SimuladorCrono {
    public static void main(String[] args) {
        int totalSegundos = 3725;

        int horas = totalSegundos / 3600;
        int segundosRestantes = totalSegundos % 3600;
        int minutos = segundosRestantes / 60;
        int segundos = segundosRestantes % 60;

        System.out.println(totalSegundos + " segundos equivalen a: " 
            + horas + "h " + minutos + "m " + segundos + "s");
    }
}
