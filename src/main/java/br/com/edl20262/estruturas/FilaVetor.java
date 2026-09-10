package br.com.edl20262.estruturas;

public class FilaVetor<T> {
    private Object[] dados;
    private int inicio;
    private int fim;
    private int quantidade;

    public FilaVetor(int tamanho){
        dados=new Object[tamanho];
        inicio=0;
        fim=0;
        quantidade=0;
    }

    public boolean estaVazia(){
        return quantidade==0;
    }

    public boolean estaCheia(){
        return quantidade==dados.length;
    }

    public void enfileirar(T elemento){
        if (this.estaCheia()) throw new IllegalStateException("Fila Cheia");
        this.dados[this.fim]=elemento;
        this.fim=(this.fim+1)%this.dados.length;
        this.quantidade++;
    }

    @SuppressWarnings("unchecked")
    public T desinfileirar(){
        if (this.estaVazia()) throw new IllegalStateException("Fila Vazia");

        T elemento=(T)this.dados[this.inicio];
        
        this.inicio=(this.inicio+1)%this.dados.length;

        this.quantidade--;

        return elemento;
    }

    @SuppressWarnings("unchecked")
    public T consultar(){
        if (this.estaVazia()) throw new IllegalStateException("Fila Vazia");

        return (T)this.dados[this.inicio];
    }
}
