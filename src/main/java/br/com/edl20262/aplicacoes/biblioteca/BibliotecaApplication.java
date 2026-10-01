package br.com.edl20262.aplicacoes.biblioteca;
import br.com.edl20262.estruturas.ListaEncadeada;
import java.util.Scanner;
public class BibliotecaApplication {
    public static void main(String[] args) {
        ListaEncadeada<Livro> catalogo=new ListaEncadeada<>();
        Scanner scanner=new Scanner(System.in);
        int operacoes=Integer.parseInt(scanner.nextLine());
        for (int i=0;i<operacoes;i++){
            String linha=scanner.nextLine();
            String[] comando=linha.split(" ");
            if (comando[0].equals("INSERIR")){
                int codigo=Integer.parseInt(comando[1]);
                String titulo=comando[2];
                Livro livro=new Livro(codigo, titulo);
                
                if (catalogo.tamanho()==0)
                    catalogo.adicionar(livro);
                else{
                    for (int j=0;j<catalogo.tamanho();j++){
                        Livro item=catalogo.obter(j);
                        if (livro.getCodigo()<item.getCodigo()){
                            catalogo.adicionar(j, livro);
                            break;
                        }
                        if (j==catalogo.tamanho()-1)
                            catalogo.adicionar(livro);
                    }
                }
                
            }
        }
        scanner.close();
        System.out.println(catalogo.toString());
    }
}
