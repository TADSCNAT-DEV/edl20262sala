package br.com.edl20262.aplicacoes;
import br.com.edl20262.estruturas.DequeVetor;
public class DequeDemoApplication {
    public static void main(String args[]){
        DequeVetor<String> deque=new DequeVetor<>(4);

        deque.inserirFrente("A");
        deque.inserirFrente("B");
        deque.inserirTras("C");
        deque.inserirFrente("D");
        System.out.println(deque.removerFrente());
        System.out.println(deque.removerTras());
        System.out.println(deque.removerTras());
    }
}
