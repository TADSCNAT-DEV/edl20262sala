package br.com.edl20262.estruturas;

public class PilhaEncadeada<T> {

    private No<T> topo;
    private int tamanho;

    public void empilhar(T valor) {
        No<T> novoNo = new No<>(valor);
        novoNo.proximo = topo;
        topo = novoNo;
        tamanho++;
    }

    public T desempilhar() {
        validarNaoVazia();

        T valor = topo.valor;
        topo = topo.proximo;
        tamanho--;
        return valor;
    }

    public T obterTopo() {
        validarNaoVazia();
        return topo.valor;
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    private void validarNaoVazia() {
        if (estaVazia()) {
            throw new IllegalStateException("A pilha está vazia.");
        }
    }

    private static class No<T> {
        private final T valor;
        private No<T> proximo;

        private No(T valor) {
            this.valor = valor;
        }
    }
}
