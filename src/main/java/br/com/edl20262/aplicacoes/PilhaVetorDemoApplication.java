package br.com.edl20262.aplicacoes;
import br.com.edl20262.estruturas.PilhaVetor;
public class PilhaVetorDemoApplication {
    public static void main(String[] args) {
        PilhaVetor<Integer> pilha=new PilhaVetor<>(3);
        pilha.empilhar(20);
        pilha.empilhar(30);
        pilha.empilhar(40);

        System.out.println(pilha.obterTopo());
        System.out.println(pilha.desempilhar());
        System.out.println(pilha.obterTopo());

    }
}
