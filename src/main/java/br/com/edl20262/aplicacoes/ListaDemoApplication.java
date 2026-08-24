package br.com.edl20262.aplicacoes;

import br.com.edl20262.estruturas.ListaEncadeada;

public class ListaDemoApplication {

    public static void main(String[] args) {
        ListaEncadeada<String> disciplinas = new ListaEncadeada<>();
        disciplinas.adicionar("Estrutura de Dados Lineares");
        disciplinas.adicionar("Programação Orientada a Objetos");
        disciplinas.adicionar(1, "Algoritmos");

        System.out.println("=== Demonstração de Lista ===");
        System.out.println("Conteúdo da lista: " + disciplinas);
        System.out.println("Primeiro elemento: " + disciplinas.obter(0));
        System.out.println("Quantidade de elementos: " + disciplinas.tamanho());
    }
}
