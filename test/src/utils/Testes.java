/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.FilaOrdenada;

/**
 *
 * @author Giii
 */
public class Testes {

    public Testes() {
    }

    @Test
    public void testInsereUmElemento() {
        FilaOrdenada fo = new FilaOrdenada(5);
        fo.enfileirar("Gabriel");

        org.junit.Assert.assertEquals("Deve retornar um vetor com um elemento", "Gabriel", fo.toString());
    }

    @Test
    public void testInsereDoisElemento() {
        FilaOrdenada fo = new FilaOrdenada(5);
        fo.enfileirar("Gisele");
        fo.enfileirar("Gabriel");


        org.junit.Assert.assertEquals("Deve retornar um vetor com um elemento", "Gabriel, Gisele", fo.toString());
    }

    @Test
    public void testInsereFilaCheia() {
        FilaOrdenada fo = new FilaOrdenada(2);
        fo.enfileirar("Gisele");
        fo.enfileirar("Gabriel");
        fo.enfileirar("Guto");


        org.junit.Assert.assertEquals("Deve retornar um vetor com um elemento", "Gabriel, Gisele", fo.toString());
    }
    
    @Test
    public void testInsereDoisRemoveUm() {
        FilaOrdenada fo = new FilaOrdenada(2);
        fo.enfileirar("Gisele");
        fo.enfileirar("Gabriel");
        fo.desenfileirar();


        org.junit.Assert.assertEquals("Deve retornar um vetor com um elemento", "Gisele", fo.toString());
    }
    
     @Test
    public void testInsereDoisRemoveUmInsereUm() {
        FilaOrdenada fo = new FilaOrdenada(2);
        fo.enfileirar("Gisele");
        fo.enfileirar("Gabriel");
        fo.desenfileirar();
        fo.enfileirar("Gabriel");


        org.junit.Assert.assertEquals("Deve retornar um vetor com um elemento", "Gabriel, Gisele", fo.toString());
    }
}