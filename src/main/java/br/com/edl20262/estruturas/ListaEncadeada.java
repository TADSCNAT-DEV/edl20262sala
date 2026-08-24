package br.com.edl20262.estruturas;

public class ListaEncadeada<T> {

    private No<T> inicio;
    private int tamanho;

    public void adicionar(T valor) {
        adicionar(tamanho, valor);
    }

    public void adicionar(int indice, T valor) {
        validarIndiceParaAdicionar(indice);

        No<T> novoNo = new No<>(valor);

        if (indice == 0) {
            novoNo.proximo = inicio;
            inicio = novoNo;
        } else {
            No<T> anterior = obterNo(indice - 1);
            novoNo.proximo = anterior.proximo;
            anterior.proximo = novoNo;
        }

        tamanho++;
    }

    public T obter(int indice) {
        validarIndice(indice);
        return obterNo(indice).valor;
    }

    public int tamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        No<T> atual = inicio;

        while (atual != null) {
            builder.append(atual.valor);
            atual = atual.proximo;
            if (atual != null) {
                builder.append(", ");
            }
        }

        return builder.append(']').toString();
    }

    private No<T> obterNo(int indice) {
        No<T> atual = inicio;
        for (int i = 0; i < indice; i++) {
            atual = atual.proximo;
        }
        return atual;
    }

    private void validarIndice(int indice) {
        if (indice < 0 || indice >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido: " + indice);
        }
    }

    private void validarIndiceParaAdicionar(int indice) {
        if (indice < 0 || indice > tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido: " + indice);
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
