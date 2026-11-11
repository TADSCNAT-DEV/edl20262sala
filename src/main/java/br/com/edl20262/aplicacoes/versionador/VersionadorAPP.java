package br.com.edl20262.aplicacoes.versionador;

import br.com.edl20262.estruturas.ArvoreBinaria;
import java.util.Scanner;
public class VersionadorAPP {

    public static void main(String[] args) {
        ArvoreBinaria versionador=new ArvoreBinaria();

        Scanner scanner=new Scanner(System.in);

        int operacoes=Integer.parseInt(scanner.nextLine());

        for(int i=0;i<operacoes;i++){
            String[] comando=scanner.nextLine().split(" ");
            switch (comando[0]) {
                case "PUBLICAR":
                    versionador.inserir(Integer.parseInt(comando[1]));
                    break;
                case "INSTALAR":
                    int versaoSistema=Integer.parseInt(comando[1]);
                    int versao=versionador.procuraVersao(versaoSistema);
                    if (versao>versaoSistema){
                        System.out.println("INCOMPATIVEL");
                    }else{
                        System.out.println(versao);
                    }
                    break;
                case "RETIRAR":
                    versionador.remover(Integer.parseInt(comando[1]));
                    break;
                default:
                    break;
            }
        }
        scanner.close();

    }
}
