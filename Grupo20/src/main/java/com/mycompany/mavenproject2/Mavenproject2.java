/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author user
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        System.out.println("La conversion en dolares es: " + Conversor.calcularCotizacion(1800000, 1620) +" Dolares");
        
        
        System.out.println("Convertir pesos a dolar " + Conversor.convertirADolar(100000, 1460) + " Dolares");
        
        
        System.out.println("Convertir dolares a pesos " + Conversor.convertirAPesos(1000, 1460) + " Pesos");
        
        
        System.out.println("El nuevo monto es " + Conversor.actualizarSaldo(1000, 500) + " Pesos");
        
        
        System.out.println("El saldo que quedo es " + Conversor.retirarMonto(1500, 1000) + " dolares");
        
    }
    
    
}
