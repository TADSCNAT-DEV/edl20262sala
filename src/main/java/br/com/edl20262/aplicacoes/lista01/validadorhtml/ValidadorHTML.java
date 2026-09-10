package br.com.edl20262.aplicacoes.lista01.validadorhtml;
import java.util.StringTokenizer;

import br.com.edl20262.estruturas.PilhaVetor;
public class ValidadorHTML {

    public static boolean validar(String html){
        StringTokenizer st = new StringTokenizer(html, ">", true);
        PilhaVetor<String> pilha = new PilhaVetor<String>(st.countTokens());
        PilhaVetor<String> pilhaAux = new PilhaVetor<String>(st.countTokens());
        while(st.hasMoreTokens()){
            pilha.empilhar(st.nextToken());
        }
        while(!pilha.estaVazia()){
            String token =pilha.desempilhar();
            if (token.startsWith("</")) {
                pilhaAux.empilhar(token);
            }else{
                if (token.startsWith("<") && !token.startsWith("</")) {
                    if (!pilhaAux.estaVazia()) {
                        String topo = pilhaAux.desempilhar();
                        String tagAberta = token.substring(1);
                        String tagFechada = topo.substring(2);
                        if (!tagAberta.equals(tagFechada)) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            }
        }
        return pilhaAux.estaVazia();
    }

    public static boolean validar2(String html){
        StringTokenizer st = new StringTokenizer(html, ">", true);
        PilhaVetor<String> pilha = new PilhaVetor<String>(st.countTokens());
        while(st.hasMoreTokens()){
            String token = st.nextToken();
            if (token.startsWith("<") && !token.startsWith("</")) {
                pilha.empilhar(token);
            } else if (token.startsWith("</")) {
                if (pilha.estaVazia()) {
                    return false;
                }
                String topo = pilha.desempilhar();
                String tagAberta = topo.substring(1);
                String tagFechada = token.substring(2);
                if (!tagAberta.equals(tagFechada)) {
                    return false;
                }
            }
        }
        return pilha.estaVazia();
    }

    public static void main(String[] args) {
        String html = "<pagina><titulo></titulo><p></p></pagina>";
        boolean valido = validar2(html);
        System.out.println("O HTML é válido? " + valido);

        html= "<pagina><p></pagina></p>";
        valido = validar2(html);
        System.out.println("O HTML é válido? " + valido);

        html="<lista><item></item><item></item></lista>";
        valido = validar2(html);
        System.out.println("O HTML é válido? " + valido);
    }
    

}
