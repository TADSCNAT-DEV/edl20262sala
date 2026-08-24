package br.com.edl20262.aplicacoes;

import br.com.edl20262.estruturas.FilaEncadeada;

public class FilaDemoApplication {

    public static void main(String[] args) {
        FilaEncadeada<String> fila = new FilaEncadeada<>();
        fila.enfileirar("Aluno A");
        fila.enfileirar("Aluno B");
        fila.enfileirar("Aluno C");

        System.out.println("=== Demonstração de Fila ===");
        System.out.println("Primeiro da fila: " + fila.obterPrimeiro());
        System.out.println("Removendo primeiro: " + fila.desenfileirar());
        System.out.println("Próximo da fila: " + fila.obterPrimeiro());
    }
}
