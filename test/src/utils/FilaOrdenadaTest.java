/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

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
public class FilaOrdenadaTest {

    public FilaOrdenadaTest() {
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

    }

    @Test
    public void testInsereDez() {
        FilaOrdenada fo = new FilaOrdenada(10);
        fo.enfileirar("Gu");
        fo.enfileirar("Ga");
        fo.enfileirar("Gi");
        fo.enfileirar("Ge");
        fo.enfileirar("Go");
        fo.enfileirar("To");
        fo.enfileirar("Ti");
        fo.enfileirar("Ta");
        fo.enfileirar("Tu");
        fo.enfileirar("Te");

        org.junit.Assert.assertEquals("Deve retornar um vetor com um elemento", "Ga, Ge, Gi, Go, Gu, Ta, Te, Ti, To, Tu", fo.toString());
    }
    
    @Test
    public void testInsereDezRemoveDois() {
        FilaOrdenada fo = new FilaOrdenada(10);
        fo.enfileirar("Gu");
        fo.enfileirar("Ga");
        fo.enfileirar("Gi");
        fo.enfileirar("Ge");
        fo.enfileirar("Go");
        fo.enfileirar("To");
        fo.enfileirar("Ti");
        fo.enfileirar("Ta");
        fo.enfileirar("Tu");
        fo.enfileirar("Te");
        fo.desenfileirar();
        fo.desenfileirar();

        org.junit.Assert.assertEquals("Deve retornar um vetor com um elemento", "Gi, Go, Gu, Ta, Te, Ti, To, Tu", fo.toString());
    }
    
    @Test
    public void testInsereDezRemoveDoisInsereDois() {
        FilaOrdenada fo = new FilaOrdenada(10);
        fo.enfileirar("Gu");
        fo.enfileirar("Ca");
        fo.enfileirar("Gi");
        fo.enfileirar("Be");
        fo.enfileirar("Do");
        fo.enfileirar("Lo");
        fo.enfileirar("Ti");
        fo.enfileirar("Pa");
        fo.enfileirar("Mu");
        fo.enfileirar("Re");
        fo.desenfileirar();
        fo.desenfileirar();
        fo.enfileirar("Fa");
        fo.enfileirar("Ja");
        

        org.junit.Assert.assertEquals("Deve retornar um vetor com um elemento", "Do, Fa, Gi, Gu, Ja, Lo, Mu, Pa, Re, Ti", fo.toString());
    }
}