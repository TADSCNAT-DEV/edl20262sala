package br.com.edl20262.aplicacoes;

import br.com.edl20262.estruturas.PilhaEncadeada;

public class PilhaDemoApplication {

    public static void main(String[] args) {
        PilhaEncadeada<Integer> pilha = new PilhaEncadeada<>();
        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(30);

        System.out.println("=== Demonstração de Pilha ===");
        System.out.println("Topo atual: " + pilha.obterTopo());
        System.out.println("Removendo topo: " + pilha.desempilhar());
        System.out.println("Novo topo: " + pilha.obterTopo());
    }
}
