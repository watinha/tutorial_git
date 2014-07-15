package utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import utils.IFila;
import utils.Fila;
import utils.FilaProxy;
import utils.FilaMock;

@RunWith(JUnit4.class)

/**
 *
 * @author Firak
 */
public class FilraProxyCompositeTest {
    
    @Test
    public void testExemploIntegracaoEnfileirarComProxy () {
        FilaProxyComposite f = new FilaProxyComposite();
        IFila fila = new Fila(5);
        f.enfileirar("Gabriel", (Fila) fila);
        f.enfileirar("Gisele",(Fila) fila);

        org.junit.Assert.assertEquals(
            "testando para ver se construtor existe",
            "[1]Gabriel, [2]Gisele", f.toString((Fila) fila));
    }

    

}
