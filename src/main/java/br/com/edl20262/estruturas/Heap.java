package br.com.edl20262.estruturas;

import java.util.Comparator;
import java.util.Objects;


public class Heap<T> {
    private final Object[] dados;
    private final Comparator<? super T> ordem;
    private int tamanho;

    public Heap(int capacidade, Comparator<? super T> ordem) {
        if (capacidade < 0) throw new IllegalArgumentException();
        dados = new Object[capacidade];
        this.ordem = Objects.requireNonNull(ordem);
    }
    public int size() { return tamanho; }

    public boolean isEmpty() { return tamanho == 0; }

    @SuppressWarnings("unchecked")
    private T item(int i) { return (T) dados[i]; }

    public T peek() { return isEmpty() ? null : item(0); }

    public void offer(T valor) {
        Objects.requireNonNull(valor);
        if (tamanho == dados.length)
            throw new IllegalStateException("Capacidade esgotada");
        int i = tamanho++;
        dados[i] = valor;
        while (i > 0) {
            int pai = (i - 1) / 2;
            if (ordem.compare(item(i), item(pai)) >= 0) break;
            trocar(i, pai);
            i = pai;
        }
    }

    public T poll() {
        if (isEmpty()) return null;
        T resposta = item(0);
        dados[0] = dados[--tamanho];
        dados[tamanho] = null;
        int i = 0;
        while (2 * i + 1 < tamanho) {
            int filho = 2 * i + 1;
            int direito = filho + 1;
            if (direito < tamanho &&
                ordem.compare(item(direito), item(filho)) < 0)
                filho = direito;
            if (ordem.compare(item(i), item(filho)) <= 0) break;
            trocar(i, filho);
            i = filho;
        }
        return resposta;
    }

    private void trocar(int a, int b) {
        Object aux = dados[a];
        dados[a] = dados[b];
        dados[b] = aux;
    }
}
