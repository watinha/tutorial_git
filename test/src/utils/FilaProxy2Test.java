package test.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import utils.IFila;
import utils.Fila;
import utils.FilaProxy2;
import test.utils.FilaMock;

@RunWith(JUnit4.class)
public class FilaProxy2Test {

    @Test
    public void testEnfileirar1elemento () {
        IFila f = new FilaProxy2(new Fila(5));

        f.enfileirar("Luma");

        org.junit.Assert.assertEquals(
            "Verificando o estado da fila",
            "[A]Luma", f.toString());
    }

    @Test
    public void testEnfileirar2Elementos () {
        IFila f = new FilaProxy2(new Fila(5));

        f.enfileirar("Marcelo");
        f.enfileirar("Leticia");

        org.junit.Assert.assertEquals(
            "Verificando o estado da fila",
            "[A]Marcelo, [B]Leticia", f.toString());
    }

    @Test
    public void testFilaVazia () {
        IFila f = new FilaProxy2(new Fila(5));

        org.junit.Assert.assertEquals(
            "Verificando o estado da fila",
            "", f.toString());
    }

    @Test
    public void testFilaCheia () {
        IFila f = new FilaProxy2(new Fila(2));

        f.enfileirar("Rafael");
        f.enfileirar("Bernardo");
        f.enfileirar("Diogo");

        org.junit.Assert.assertEquals(
            "Verificando o estado da fila",
            "[A]Rafael, [B]Bernardo", f.toString());
    }

    @Test
    public void testDesenfileirar1Elemento () {
        IFila f = new FilaProxy2(new Fila(2));

        f.enfileirar("Rafael");
        f.enfileirar("Bernardo");

        org.junit.Assert.assertEquals(
            "Verificando o estado da fila",
            "[A]Rafael", f.desenfileirar());
    }

    @Test
    public void testDesenfileirarTresElementos () {
        IFila f = new FilaProxy2(new Fila(3));

        f.enfileirar("Diogo");
        f.enfileirar("Jonas");
        f.enfileirar("Filipe");

        org.junit.Assert.assertEquals(
            "Verificando o estado da fila",
            "[A]Diogo", f.desenfileirar());
        org.junit.Assert.assertEquals(
            "Verificando o estado da fila",
            "[B]Jonas", f.desenfileirar());
        org.junit.Assert.assertEquals(
            "Verificando o estado da fila",
            "[C]Filipe", f.desenfileirar());
    }

    @Test
    public void testEncherAFilaERemoverEInserirUmNovoElemento () {
        IFila f = new FilaProxy2(new Fila(3));

        f.enfileirar("Diogo");
        f.enfileirar("Jonas");
        f.enfileirar("Filipe");

        f.desenfileirar();

        f.enfileirar("Daniel");

        org.junit.Assert.assertEquals(
            "Verificando o estado da fila",
            "[B]Jonas, [C]Filipe, [D]Daniel", f.toString());
    }
    @Test
    public void testAdicionaAlgunsElementos() {
        IFila f = new FilaProxy2(new Fila(5));

		for(int i = 1; i <= 5; i++){
			f.enfileirar(Integer.toString(i));
		}
		
        org.junit.Assert.assertEquals(
            "Verificando o estado da fila",
            "[A]1, [B]2, [C]3, [D]4, [E]5", f.toString());
    }

    @Test
    public void testAdiciona26Elementos() {
        IFila f = new FilaProxy2(new Fila(26));

		for(int i = 1; i <= 26; i++){
			f.enfileirar(Integer.toString(i));
		}
		
        org.junit.Assert.assertEquals(
            "Verificando o estado da fila",
            "[A]1, [B]2, [C]3, [D]4, [E]5, [F]6, [G]7, [H]8, [I]9, [J]10, [K]11, [L]12, [M]13, [N]14, [O]15, [P]16, [Q]17, [R]18, [S]19, [T]20, [U]21, [V]22, [W]23, [X]24, [Y]25, [Z]26", f.toString());
    }

    @Test
    public void testAdiciona27() {
        IFila f = new FilaProxy2(new Fila(27));

		for(int i = 1; i <= 27; i++){
			f.enfileirar(Integer.toString(i));
		}
		
        org.junit.Assert.assertEquals(
            "Verificando o estado da fila",
            "[A]1, [B]2, [C]3, [D]4, [E]5, [F]6, [G]7, [H]8, [I]9, [J]10, [K]11, [L]12, [M]13, [N]14, [O]15, [P]16, [Q]17, [R]18, [S]19, [T]20, [U]21, [V]22, [W]23, [X]24, [Y]25, [Z]26, [AA]27", f.toString());
    }

    @Test
    public void testAdiciona28() {
        IFila f = new FilaProxy2(new Fila(28));

		for(int i = 1; i <= 28; i++){
			f.enfileirar(Integer.toString(i));
		}
		
        org.junit.Assert.assertEquals(
            "Verificando o estado da fila",
            "[A]1, [B]2, [C]3, [D]4, [E]5, [F]6, [G]7, [H]8, [I]9, [J]10, [K]11, [L]12, [M]13, [N]14, [O]15, [P]16, [Q]17, [R]18, [S]19, [T]20, [U]21, [V]22, [W]23, [X]24, [Y]25, [Z]26, [AA]27, [AB]28", f.toString());
    }

    @Test
    public void testAdiciona28ERemove1() {
        IFila f = new FilaProxy2(new Fila(28));

		for(int i = 1; i <= 28; i++){
			f.enfileirar(Integer.toString(i));
		}
		f.desenfileirar();
        org.junit.Assert.assertEquals(
            "Verificando o estado da fila",
            "[B]2, [C]3, [D]4, [E]5, [F]6, [G]7, [H]8, [I]9, [J]10, [K]11, [L]12, [M]13, [N]14, [O]15, [P]16, [Q]17, [R]18, [S]19, [T]20, [U]21, [V]22, [W]23, [X]24, [Y]25, [Z]26, [AA]27, [AB]28", f.toString());
    }

    @Test
    public void testAdiciona53() {
        IFila f = new FilaProxy2(new Fila(53));

		for(int i = 1; i <= 53; i++){
			f.enfileirar(Integer.toString(i));
		}
		
        org.junit.Assert.assertEquals(
            "Verificando o estado da fila",
            "[A]1, [B]2, [C]3, [D]4, [E]5, [F]6, [G]7, [H]8, [I]9, [J]10, [K]11, [L]12, [M]13, [N]14, [O]15, [P]16, [Q]17, [R]18, [S]19, [T]20, [U]21, [V]22, [W]23, [X]24, [Y]25, [Z]26, [AA]27, [AB]28, [AC]29, [AD]30, [AE]31, [AF]32, [AG]33, [AH]34, [AI]35, [AJ]36, [AK]37, [AL]38, [AM]39, [AN]40, [AO]41, [AP]42, [AQ]43, [AR]44, [AS]45, [AT]46, [AU]47, [AV]48, [AW]49, [AX]50, [AY]51, [AZ]52, [BA]53", f.toString());
    }
}
