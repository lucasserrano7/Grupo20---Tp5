package com.mycompany.mavenproject2;

import java.text.DecimalFormat;

public class Conversor {

    double pesos;
    double dolar;
    double saldo;

    public Conversor() {
    }

    public static double convertirADolar(double pesos, double dolar) {
        return pesos / dolar;
    }

    public static String convertirAPesos(double dolar, double cotizacion) {

        double resultado = dolar * cotizacion;
        DecimalFormat df = new DecimalFormat("$ #,##0");
        String resultado2 = df.format(resultado);

        return resultado2;

    }

    public static double calcularCotizacion(double pesos, double dolar) {

        if (pesos == 0) {
            throw new ArithmeticException("Los pesos no pueden ser cero");
        }

        double resultado = pesos / dolar;

        return resultado;
    }

    public static double actualizarSaldo(double saldo, double nuevoMonto) {
        return saldo + nuevoMonto;
    }

    public static double retirarMonto(double saldo, double monto) {
        return saldo - monto;
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
