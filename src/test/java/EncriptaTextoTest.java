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
public class EncriptaTextoTest {
  
    @Test
    public void testaFraseComRaizExata() {
        String s = "parapente";
        var encriptaTexto = new EncriptaTexto(s);
        assertEquals("pan apt ree ", encriptaTexto.encriptar());
    }
    @Test
    public void testaFraseComRaizNaoExata() {
        String s = "tenha um bom dia";
        var encriptaTexto = new EncriptaTexto(s);
        assertEquals("taoa eum nmd hbi ", encriptaTexto.encriptar());
    }

    /**
     * Test of encriptar method, of class EncriptaTexto.
     */
    @Test
    public void testaEncriptaTextoVazio() {
        String s = "";
        var encriptaTexto = new EncriptaTexto(s);
        assertEquals("", encriptaTexto.encriptar());
       
    }
}
