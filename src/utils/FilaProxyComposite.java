/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.ArrayList;

/**
 *
 * @author Firak
 */
public class FilaProxyComposite {

    private IFila destino;

    FilaProxyComposite() {

    }

    public FilaProxyComposite(IFila destino) {
        this.destino = destino;
    }

    public void enfileirar(String nome, Fila f) {
        f.enfileirar(nome);
    }

    public String desenfileirar(Fila f) {

        return f.desenfileirar();

    }

    public String toString(Fila f) {
        return f.toString();
    }

}
