package utils;

public class Fila implements IFila {
    private int tamanho, fim = 0, inicio = 0;
    private boolean cheio = false;
    //private String [] alunos;
    private Object[] alunos;

    public Fila (int tamanho) {
        this.tamanho = tamanho;
        this.alunos = new Object[tamanho];
    }

    public int getTamanho () {
        return this.tamanho;
    }

    public void enfileirar (Object nome) {
        if ( ! this.cheio) {
            this.alunos[this.fim] = nome;
            this.fim = (this.fim + 1) % this.alunos.length;
            if (this.fim == this.inicio)
                this.cheio = true;
        }
    }

    public Object desenfileirar () {
        this.cheio = false;
        return this.alunos[this.inicio++];
    }

    public String toString () {
        String resultado = "";
        int tamanho;
		if ( ! this.cheio && this.fim == this.inicio)
			return resultado;
		if(this.fim > this.inicio)
			tamanho = this.fim - this.inicio;
		else
			tamanho = this.alunos.length - this.inicio + this.fim;
		for (int i = 0; i < tamanho; i++)
			resultado += this.alunos[(this.inicio + i) % this.alunos.length] + ", ";
		return resultado.substring(0, resultado.length() - 2);
	}
}
