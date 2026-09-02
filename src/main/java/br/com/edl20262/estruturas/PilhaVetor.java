package br.com.edl20262.estruturas;

public class PilhaVetor<T> {
    private Object vetor[];
    private int topo=-1;
    public PilhaVetor(int tamanho){
        vetor=new Object[tamanho];
    }

    public void empilhar(T elemento){
        if (!this.estaCheia()){
            vetor[++topo]=elemento;
        }
    }

    @SuppressWarnings("unchecked")
    public T desempilhar(){
        if (!this.estaVazia()){
            T valor=(T)vetor[topo--];
            return valor;
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    public T obterTopo(){
        if (!this.estaVazia()){
            T valor=(T)vetor[topo];
            return valor;
        }
        return null;
    }

    public boolean estaCheia(){
        return topo==vetor.length-1;
    }
    public boolean estaVazia(){
        return topo==-1;
    }
}
