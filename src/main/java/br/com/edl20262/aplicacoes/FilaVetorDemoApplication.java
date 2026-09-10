package br.com.edl20262.aplicacoes;
import br.com.edl20262.estruturas.FilaVetor;
public class FilaVetorDemoApplication {
    public static void main(String[] args) {
        FilaVetor<Integer> fila=new FilaVetor<>(10);

        fila.enfileirar(10);
        fila.enfileirar(20);
        fila.enfileirar(30);
        int primeiro=fila.desinfileirar();
        System.out.println("Primeiro:"+(primeiro));
        System.out.println("Primeiro Atual:"+(fila.consultar()));
    }
}
