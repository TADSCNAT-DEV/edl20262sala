package br.com.edl20262.estruturas;

public class DequeVetor<T> {
    private Object[] dados;
    private int inicio;
    private int fim;
    private int quantidade;

    public DequeVetor(int tamanho){
        dados=new Object[tamanho];
        inicio=0;
        fim=0;
        quantidade=0;
    }

    public boolean estaCheio(){
        return this.quantidade==dados.length;
    }

    public boolean estaVazio(){
        return this.quantidade==0;
    }

    public void inserirFrente(T elemento){
        if (this.estaCheio()) throw new IllegalStateException("Deque Cheio");
        if (this.quantidade>0){
            this.inicio=(this.inicio-1+this.quantidade)%dados.length;
        }
        dados[this.inicio]=elemento;
        this.quantidade++;

    }

    public void inserirTras(T elemento){
        if (this.estaCheio()) throw new IllegalStateException("Deque Cheio");
        
        if (this.quantidade>0){
            this.fim=(this.fim+1)%dados.length;
        }
        this.dados[this.fim]=elemento;
        this.quantidade++;
    }

    @SuppressWarnings("unchecked")
    public T removerFrente(){
        if (this.estaVazio()) throw new IllegalStateException("Deque vazio");
        T elemento=(T)this.dados[this.inicio];
        if (this.quantidade>1){
            this.inicio=(this.inicio+1)%dados.length;
        }
        this.quantidade--;
        return elemento;

    }

    @SuppressWarnings("unchecked")
    public T removerTras(){
        if (this.estaVazio()) throw new IllegalStateException("Deque vazio");
        T elemento=(T)this.dados[this.fim];
        if (this.quantidade>1){
            this.fim=(this.fim-1+this.dados.length)%dados.length;
        }
        this.quantidade--;
        return elemento;
    }

    @SuppressWarnings("unchecked")
    public T consultarFrente(){
        if (this.estaVazio()) throw new IllegalStateException("Deque Vazio");

        return (T)this.dados[this.inicio];
    }

    @SuppressWarnings("unchecked")
    public T consultarTras(){
        if (this.estaVazio()) throw new IllegalStateException("Deque Vazio");

        return (T)this.dados[this.fim];
    }

}
