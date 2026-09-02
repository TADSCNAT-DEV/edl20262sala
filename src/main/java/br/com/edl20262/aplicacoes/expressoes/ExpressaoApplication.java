package br.com.edl20262.aplicacoes.expressoes;
import br.com.edl20262.estruturas.PilhaEncadeada;;
public class ExpressaoApplication {
    private PilhaEncadeada<Character> expressao;
    public ExpressaoApplication(){
       expressao=new PilhaEncadeada<>();
    }
    public boolean validarExpressao(String formula){
        for(char c : formula.toCharArray()){
            if (c=='(' || c=='[' || c=='{'){
                this.expressao.empilhar(c);
            }else if (c==')' || c==']' || c=='}'){
                if (this.expressao.estaVazia()){
                    return false;
                }
                Character elemento=this.expressao.desempilhar();

                if ((c==')' && elemento!='(') || (c==']' && elemento!='[') || (c=='}' && elemento!='{')){
                    return false;
                }
            }
        }
        return this.expressao.estaVazia();
    }

    public static void main(String[] args) {
        ExpressaoApplication app=new ExpressaoApplication();
        
        String exp1="SOMA(A1*(B1+C1))";
        String exp2="SE([A1>B1],{A1+B1})";
        String exp3="([A1+B1)]";
        String exp4="((A1+B1)";

        System.out.println(app.validarExpressao(exp1));
        System.out.println(app.validarExpressao(exp2));
        System.out.println(app.validarExpressao(exp3));
        System.out.println(app.validarExpressao(exp4));
    }
}
