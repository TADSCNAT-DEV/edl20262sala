package br.com.edl20262.aplicacoes.impressao;
import br.com.edl20262.estruturas.FilaVetor;
public class Impressora {
    private FilaVetor<String> buffer;

    public Impressora(int tamanhoBuffer){
        buffer=new FilaVetor<String>(tamanhoBuffer);
    }

    public void enfileirar(String trabalho){
        try{
            buffer.enfileirar(trabalho);
        }catch(IllegalStateException e){
            System.out.println(e.getMessage());
        }
    }

    public void imprimir(){
        try{
            String trabalho=buffer.desinfileirar();
            System.out.println(trabalho);
        }catch(IllegalStateException e){
            System.out.println(e.getMessage());
        }
    }
}
