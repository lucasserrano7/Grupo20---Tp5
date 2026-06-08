/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author DAIAN
 */

    
 
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversorTest {

    @Test
    void testActualizarSaldo() {

        double resultado =
                Conversor.actualizarSaldo(5000, 1000);

        assertEquals(6000, resultado, 0.001);
    }

    @Test
    void testRetirarMonto() {

        double resultado =
                Conversor.retirarMonto(5000, 1000);

        assertEquals(4000, resultado, 0.001);
    }
}

