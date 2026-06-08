/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author DAIAN
 */

    
 
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInfo;

public class ConversorTest {
    
    @BeforeAll
    static void IniciarTest(){
        System.out.println("Bienvenido al sistema de pruebas");
    }
    @BeforeEach
     void beforeTest(TestInfo testinfo){
        System.out.println("Corriendo prueba: " + testinfo.getDisplayName());
    }
    
    @Test
    @DisplayName("Prueba aumentar saldo.")
    void testActualizarSaldo() {

        double resultado =
                Conversor.actualizarSaldo(5000, 1000);

        assertEquals(6000, resultado, 0.001);
    }

    @Test
    @DisplayName("Prueba retirar saldo.")
    void testRetirarMonto() {

        double resultado =
                Conversor.retirarMonto(5000, 1000);

        assertEquals(4000, resultado, 0.001);
    }

    @AfterEach
    void afterTest(){
        System.out.println("Prueba finalizada, campos en $0");
    }
    @AfterAll
    static void finTest(){
        System.out.println("La operacion ha finalizado");
    }
}

