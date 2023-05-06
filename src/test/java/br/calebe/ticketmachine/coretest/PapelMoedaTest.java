/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package br.calebe.ticketmachine.coretest;

import org.junit.jupiter.api.*;

import br.calebe.ticketmachine.core.PapelMoeda;

/**
 *
 * @author Marcella Costa
 */

public class PapelMoedaTest {
    
    @Test
    public void testaInstanciaDeUmObjeto(){
        PapelMoeda papelMoeda = new PapelMoeda(100, 5);
        
        Assertions.assertEquals(10, papelMoeda.getValor());
    }

    
}
