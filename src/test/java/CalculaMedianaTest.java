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
public class CalculaMedianaTest {
    
    @Test
    public void testaVetorImparOrdenado() {
        int[] vetor = {3, 6, 8, 13, 22, 24, 26};
        var calculaMediana = new CalculaMediana(vetor);
        assertEquals(13, calculaMediana.calculaMediana());
    }
    
    @Test
    public void testaVetorImparNaoOrdenado() {
        int[] vetor = {12, 20, 1, 7, 14, 33, 8, 16, 3};
        var calculaMediana = new CalculaMediana(vetor);
        assertEquals(12, calculaMediana.calculaMediana());
    }
    
    @Test
    public void testaVetorImparValoresRepetidos() {
        int[] vetor = {12, 20, 1, 7, 14, 1, 33, 8, 12, 4, 16, 3, 14 };
        var calculaMediana = new CalculaMediana(vetor);
        assertEquals(12, calculaMediana.calculaMediana());
    }

    /**
     * Test of calculaMediana method, of class CalculaMediana.
     */
    @Test
    public void testCalculaMedianaVazio() {
        int[] vetor = null;
        var calculaMediana = new CalculaMediana(vetor);
        assertEquals(0 , calculaMediana.calculaMediana());
    }
    
}
