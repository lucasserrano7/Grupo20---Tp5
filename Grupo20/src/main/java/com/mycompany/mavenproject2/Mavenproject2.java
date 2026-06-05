/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double saldo = 5000;
        
        System.out.println("--------- Bienvenidos a la app Conversora de monedas ---------");
        System.out.println("La cotizacion del dolar es : $ 1460");
        double cotizacion=1460;
   do {     
        System.out.println("1. Convertir pesos a dolar");
            System.out.println("2. Convertir dolares a pesos");
            System.out.println("3. Calcular cotizacion");
            System.out.println("4. Ingresar dinero");
            System.out.println("5. Retirar dinero");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción (1-6): ");
            
            while (!scanner.hasNextInt()) {
                System.out.print("Por favor, ingrese un número valido: ");
                scanner.next();
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Convertir pesos a dolar ---");
                    System.out.print("Ingrese el monto en pesos");
                    double pesos = scanner.nextDouble();
                    System.out.println("La conversion en dolares es: u$ " + Conversor.calcularCotizacion(pesos, cotizacion) +" Dolares");
                    
                    break;

                case 2:
                    System.out.println("\n--- Convertir dolares a pesos ---");
                    System.out.print("Ingrese el monto en dolares");
                    double dolar = scanner.nextDouble();
                    System.out.println("La conversion de dolares es : $ " + Conversor.convertirAPesos(dolar, cotizacion) + " pesos");
                   
                    break;

                case 3:
                    System.out.println("\n--- Cotizacion ---");
                    System.out.println("\n--- Elija una opcion ---");
                    System.out.println("1. Convertir pesos a dolares");
                    System.out.println("2. Convertir dolares a pesos");
                        int opcion2 = scanner.nextInt();
                        switch (opcion2) {
                        case 1:
                            System.out.println("Ingrese la cantidad de pesos que desea cotizar en dolares");
                            double pesos1 = scanner.nextDouble();
                    System.out.println("La conversion de pesos es: u$ " + Conversor.calcularCotizacion(pesos1, cotizacion) +" Dolares");
                            break;
                        case 2:
                            System.out.println("Ingrese la cantidad de dolares que desea cotizar en pesos");
                            double dolar1 = scanner.nextDouble();
                    System.out.println("La conversion de pesos es: u$ " + Conversor.convertirADolar(dolar1, cotizacion) +" Dolares");
                            break;
                        default:
                            throw new AssertionError();
                    }
                    break;
                
                case 4:
                    System.out.println("\n--- Ingresar Saldo ---");
                    System.out.print("Ingrese el monto en dolares");
                    double dolar2 = scanner.nextDouble();
                    System.out.println("El nuevo monto es: " + Conversor.actualizarSaldo(saldo, dolar2) + " Dolares");         
                   
                    break;
                
                case 5:
                    System.out.println("\n--- Retirar Monto ---");
                    System.out.print("Ingrese el monto en dolares que desea retirar");
                    double dolar3 = scanner.nextDouble();
                    System.out.println("El nuevo monto es: " + Conversor.actualizarSaldo(saldo, dolar3) + " Dolares");        
                   
                    break;                    
                    
                case 6:
                    System.out.println("\nGracias por usar la app");
                    break;

                default:
                    System.out.println("Opcion incorrecta. Intente de nuevo.");
            }
        } while (opcion != 6);

 
    
}
}