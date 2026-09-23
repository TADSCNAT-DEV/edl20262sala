package br.com.edl20262.aplicacoes.impressao;

public class ImpressoraApplication {
    public static void main(String[] args) {
        Impressora impressora=new Impressora(4);
        impressora.enfileirar("A");
        impressora.enfileirar("B");
        impressora.enfileirar("C");
        impressora.imprimir();
        impressora.enfileirar("D");
        impressora.enfileirar("E");
        impressora.imprimir();
        impressora.enfileirar("F");
    }
}
