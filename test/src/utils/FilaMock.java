package utils;

import utils.IFila;

public class FilaMock implements IFila {

    public Object [] a = new Object[15];
    public int tam = 0;

    public void enfileirar (Object aluno) {
        this.a[this.tam++] = aluno;
    }

    public String desenfileirar () { return ""; }


    public String toString () { return ""; }
}
