package br.com.edl20262.aplicacoes.bandejao;

import br.com.edl20262.estruturas.PilhaVetor;
import br.com.edl20262.aplicacoes.bandejao.Bandeja;

public class DispensadorBandeja {
    private PilhaVetor<Bandeja> pilha;

    public DispensadorBandeja(int tamanho){
        this.pilha=new PilhaVetor<>(tamanho);
    }

    public void colocarBandeja(Bandeja bandeja){
        if (pilha.empilhar(bandeja)){
            System.out.println("Bandeja Empilhada:"+bandeja.getNumero());
        }else{
            System.out.println("Dispensador Cheio");
        }
    }

    public void retirarBandeja(){
        Bandeja bandeja=pilha.desempilhar();

        if (bandeja!=null){
            System.out.println("Bandeja removida:"+bandeja.getNumero());
        }else{
            System.out.println("Dispensador Vazio!");
        }
    }
}
