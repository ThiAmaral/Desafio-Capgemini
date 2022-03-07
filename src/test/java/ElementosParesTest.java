/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Thiago
 */
public class ElementosParesTest {
    
    @Test
    public void testaVetorOrdenado() {
        int[] vetor = {3, 6, 8, 13, 22, 24, 26};
        int x = 2;
        var elementosPares = new ElementosPares(vetor, x);
        assertEquals(3, elementosPares.calculaPares());
    }
    @Test
    public void testaVetorNaoOrdenado() {
        int[] vetor = {12, 20, 1, 7, 14, 33, 8, 16, 3};
        int x = 4;
        var elementosPares = new ElementosPares(vetor, x);
        assertEquals(4, elementosPares.calculaPares());
    }

    /**
     * Test of calculaPares method, of class ElementosPares.
     */
    @Test
    public void testCalculaParesVazio() {
        int[] vetor = {};
        int x = 0;
        var elementosPares = new ElementosPares(vetor, x);
        assertEquals(0, elementosPares.calculaPares());
    }
    
}
