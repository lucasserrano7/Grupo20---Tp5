/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author angel
 */
public class Conversor {
    double pesos;
    double dolar;
    double saldo;
    
    public Conversor(double pesos, double dolar, double saldo) {
        this.pesos= pesos;
        this.dolar= dolar;
        this.saldo = saldo;
    }
    

public static double convertirADolar(double pesos, double dolar){
    
    double resultado = pesos/dolar;
    
    return resultado;
    
}   

public static double convertirAPesos(double pesos, double dolar){
    
    double resultado = pesos*dolar;
    
    return resultado;
    
}   

public static double calcularCotizacion(double pesos, double dolar){
    
    double resultado= pesos/dolar;
        
        
    return resultado;
}

public static double actualizarSaldo(double saldo, double nuevoMonto){
    double resultado = saldo + nuevoMonto;
    
    return resultado;
}

public static double retirarMonto(double saldo, double monto){
    double resultado = saldo - monto;
    
    return resultado;
}
   
}
/*Realizar la clase java Conversor de Moneda que permite por el
momento, realizar las cuatro operaciones convertir una moneda en
otra (1000$ * 1200 U$S),
calcular cotización (si me dan 1620U$S por
$1800000, a cuanto cotiza?), 
aumentar saldos (en mi cuenta tengo
U$S500, actualizo lo comprado), 
luego retiro dólar físico como
queda (es decir, extraigo en billetes de U$S 100, los U$S2100 que tengo*/