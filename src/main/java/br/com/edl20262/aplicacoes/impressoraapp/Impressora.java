package br.com.edl20262.aplicacoes.impressoraapp;
import br.com.edl20262.estruturas.ListaEncadeada;
import java.util.Scanner;
public class Impressora {
    public static void main(String[] args) {
        ListaEncadeada<Trabalho> poolImpressora=new ListaEncadeada<>();
        Scanner scanner=new Scanner(System.in);
        int numero_comandos=Integer.parseInt(scanner.nextLine());
        for(int i=0;i<numero_comandos;i++){
            String comando=scanner.nextLine();
            String[] operacao=comando.split(" ");

            if(operacao[0].equals("ADICIONAR")){
                Trabalho trabalho=new Trabalho(operacao[1], Integer.parseInt(operacao[2]));
                poolImpressora.adicionar(trabalho);
            }else if(operacao[0].equals("CANCELAR")){
                String codigo=operacao[1];
                for(int j=0;j<poolImpressora.tamanho();j++){
                    Trabalho trabalho=poolImpressora.obter(j);
                    if(trabalho.getCodigo().equals(codigo)){
                        System.out.println("CANCELADO "+codigo);
                        poolImpressora.remover(j);
                        break;
                    }
                }
            }else if(operacao[0].equals("IMPRIMIR")){
                Trabalho trabalho_impresso=poolImpressora.remover(0);
                System.out.println("IMPRESSO "+trabalho_impresso.getCodigo()+" "+trabalho_impresso.getPaginas());
            }
        }
        System.out.print("FILA ");
        int paginas_pendentes=0;
        for(int i=0;i<poolImpressora.tamanho();i++){
            Trabalho trabalho=poolImpressora.obter(i);
            System.out.print(trabalho);
            if (i!=poolImpressora.tamanho()-1){
                System.out.print(" -> ");
            }
            paginas_pendentes+=trabalho.getPaginas();
        }
        System.out.println("");
        System.out.println("PAGINAS_PENDENTES "+paginas_pendentes);


        scanner.close();
    }
}
