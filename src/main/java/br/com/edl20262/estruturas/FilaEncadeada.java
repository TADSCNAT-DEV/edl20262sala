package br.com.edl20262.estruturas;

public class FilaEncadeada<T> {

    private No<T> inicio;
    private No<T> fim;
    private int tamanho;

    public void enfileirar(T valor) {
        No<T> novoNo = new No<>(valor);

        if (estaVazia()) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            fim = novoNo;
        }

        tamanho++;
    }

    public T desenfileirar() {
        validarNaoVazia();

        T valor = inicio.valor;
        inicio = inicio.proximo;
        tamanho--;

        if (inicio == null) {
            fim = null;
        }

        return valor;
    }

    public T obterPrimeiro() {
        validarNaoVazia();
        return inicio.valor;
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    private void validarNaoVazia() {
        if (estaVazia()) {
            throw new IllegalStateException("A fila está vazia.");
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
