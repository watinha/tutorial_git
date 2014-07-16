package utils;

public class FilaEncadeada implements IFila {
    
    public No inicio;
    public No fim;
    public int tamanho;

     public FilaEncadeada() {
        inicio = null;
        fim = null;
        tamanho = 0;
    }
     
    boolean vazia(){
        return(this.inicio==null);
    }
    
    void imprime(FilaEncadeada fe){
        No novo;
        for(novo=fe.inicio;novo!=null;novo=novo.prox){
            System.out.println(novo.dado);
        }
    }

    @Override
    public void enfileirar(String nome) {
        No novo = new No(nome);
        
        if(this.vazia()){
            this.inicio=novo;
        }
        else{
            this.fim.prox=novo;
        }
        this.fim=novo;
        this.tamanho++;
    }

    @Override
    public String desenfileirar() {
        No novo = new No();
        if(this.vazia()){
            System.out.print("Fila Vazia");
            System.exit(1);
        }
        novo=inicio;
        inicio=novo.prox;
        this.tamanho--;
        
        return null;
        
    }
    
    public String toString(){
        
        if(this.tamanho==0){
            return "[]";
        }
        
        StringBuilder resultado =  new StringBuilder("[");
        No novo=inicio;
        
        for(int i=0;i<this.tamanho;i++){
            resultado.append(novo.dado);
            resultado.append(",");
            novo=novo.prox;
        }
        
        resultado.append("]");
        
        return resultado.toString();
       
    }
}
    
    
