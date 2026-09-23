package br.com.edl20262.aplicacoes.historico;
import br.com.edl20262.estruturas.DequeVetor;
public class HistoricoNavegacao {
    private DequeVetor<String> historico;

    public HistoricoNavegacao(int tamanhoNavegacao){
        historico=new DequeVetor<>(tamanhoNavegacao);
    }

    public void registrarPesquisa(String termo){
        if (historico.estaCheio()){
            String ultimo=historico.removerTras();
            System.out.println("Removido:"+ultimo);
        }
        historico.inserirFrente(termo);
    }

    public void apagarRecente(){
        try{
            String ultimoTermo=historico.removerFrente();
            System.out.println("Termo remvoido:"+ ultimoTermo);
        }catch(IllegalStateException e){
            System.out.println(e.getMessage());
        }
    }

    public void consultarRecente(){
        try{
            String ultimoTermo=historico.consultarFrente();
            System.out.println("Última Pesquisa: "+ultimoTermo);
        }catch(IllegalStateException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        HistoricoNavegacao historicoNavegacao=new HistoricoNavegacao(5);
        historicoNavegacao.registrarPesquisa("mapa");
        historicoNavegacao.registrarPesquisa("clima");
        historicoNavegacao.registrarPesquisa("ônibus");
        historicoNavegacao.registrarPesquisa("cinema");
        historicoNavegacao.registrarPesquisa("música");
        historicoNavegacao.registrarPesquisa("livros");
        historicoNavegacao.apagarRecente();
        historicoNavegacao.registrarPesquisa("saúde");
        historicoNavegacao.consultarRecente();
    }
}
