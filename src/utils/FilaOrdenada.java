/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Giii
 */
public class FilaOrdenada extends Fila {

    private String[] array;
    private static int indice;

    public FilaOrdenada(int tamanho) {
        super(tamanho);
        indice = 0;
    }

    @Override
    public void enfileirar(String novoElemento) {
        array = getAlunos();
        if (!isCheio()) {


            if (array[getInicio()] == null) {
                array[getInicio()] = novoElemento;
            } else {
                int aux;
                for (aux = indice - 1; aux >= getInicio() && novoElemento.compareTo(array[aux]) < 0; aux--) {
                    array[aux + 1] = array[aux];
                }
                array[aux + 1] = novoElemento;
            }

            indice++;
            if (indice == getTamanho()) {
                setCheio(true);
            }
            setFim(indice);
            setAlunos(array);
        }
    }

    @Override
    public String desenfileirar() {
        setCheio(false);
        array = getAlunos();
        indice--;
        setFim(indice);
        for (int i = 0; i < getTamanho() - 1; i++) {
            array[i] = array[i + 1];
        }
        setAlunos(array);
        getAlunos()[getTamanho() - 1] = "";
        return "";
    }
}
