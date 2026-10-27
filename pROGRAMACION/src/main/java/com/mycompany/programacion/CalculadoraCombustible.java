/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion;

/**
 *
 * @author 18_1DAW
 */
public class CalculadoraCombustible{
public static void main(String[] args) {
    // Variables Constantes
        final double CONSUMO_POR_KM = 14.75;
        final int RESERVA_SEGURIDAD = 500;
        
    // Variables que No son contantes
        int distanciaKm = 4800;
        double precioLitro = 2.35;
        
    // Calculos 
        double litrostotalesexactos = (distanciaKm * CONSUMO_POR_KM) + RESERVA_SEGURIDAD;
        double costetotallitros = litrostotalesexactos * precioLitro;
        
    //Aplicacion casting explicito
        int litrosoficialescomprar = (int) litrostotalesexactos;
        int costepresupuestado = (int) costetotallitros;
        
    //Monstrar en pantalla
        System.out.println(" Distancia objetivo: " + distanciaKm + " km");
        System.out.println(" Consumo base: " + CONSUMO_POR_KM + " litros/km");
        System.out.println(" Reserva de seguridad: " + RESERVA_SEGURIDAD + " litros");

        System.out.println(" Litros totales exactos: " + litrostotalesexactos + " L");
        System.out.println(" Coste total exacto: " + costetotallitros + " €");
        System.out.println(" Litros oficiales a comprar: " + litrosoficialescomprar + " L");
        System.out.println(" Coste presupuestado entero: " + costepresupuestado + " €");

    }
}
