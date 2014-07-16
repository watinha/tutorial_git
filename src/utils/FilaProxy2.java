package utils;

public class FilaProxy2 implements IFila {
    private IFila destino;
    private int cont = 0;
    private char letras[] = new char[26];

	
    public FilaProxy2 (IFila destino) {
        this.destino = destino;
        atribuiLetras();
    }
	/*
	* atribui as letras do alfabeto no vetor de acordo com o indice
	* */
	public void atribuiLetras(){
		int n_asc = 65;
		for (int i = 0; i < 26; i++){
			letras[i] = (char)(n_asc + i);
		}
	}

	/*
	 *	Econtra a combinacao de letras necessaria para representar o indice do novo elemento
	 * */
	public String atribuiIndice(){
		int valor = this.cont-1;
		String combinacao = Character.toString(letras[valor%26]);
		valor = valor/26;
		while(valor > 0){
			combinacao = Character.toString(letras[(valor%26)-1]) + combinacao;
			valor = valor/26;
		}
		return combinacao;
	}
	/*
	 *	adiciona o indice alfabetico de acordo com a ordem de chegada do novo elemento
	 * */
    public void enfileirar (Object aluno) {
		this.cont++;
        this.destino.enfileirar("[" + atribuiIndice() + "]" + aluno);
    }

    public Object desenfileirar (){
        return (this.destino.desenfileirar());
    }

    public String toString () {
        return this.destino.toString();
    }
}
