package br.com.edl20262.aplicacoes;
import br.com.edl20262.estruturas.Heap;
public class HeapDempApplicHeapion {
    public static void main(String[] args) {
        Heap<Integer> minimo = new Heap<>(10, Integer::compare);

        minimo.offer(8); minimo.offer(3); minimo.offer(6);

        System.out.println(minimo.peek()); // 3

        System.out.println(minimo.poll()); // 3

        System.out.println(minimo.size()); // 2

        System.out.println(minimo.peek());

        Heap<Integer> maximo = new Heap<>(10,

        (a, b) -> Integer.compare(b, a));//Aqui ficou máximo porque o comparador informado na criação da Heap foi invertido.

        maximo.offer(8); maximo.offer(3);

        System.out.println(maximo.poll()); // 8
    }
}
