package br.com.edl20262.aplicacoes.bandejao;

public class Bandeja {
    private int numero;
    private String cor;

    public Bandeja(int numero,String cor){
        this.numero=numero;
        this.cor=cor;
    }

    public void setNumero(int numero){
        this.numero=numero;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setCor(String cor){
        this.cor=cor;
    }

    public String getCor(){
        return this.cor;
    }
}
