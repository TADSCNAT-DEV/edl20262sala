package br.com.edl20262.aplicacoes.bandejao;

import br.com.edl20262.aplicacoes.bandejao.Bandeja;
import br.com.edl20262.aplicacoes.bandejao.DispensadorBandeja;;
public class DispensadorApplication {
    public static void main(String[] args) {
        DispensadorBandeja dispensador=new DispensadorBandeja(6);

        Bandeja b1=new Bandeja(101, "Azul");
        dispensador.colocarBandeja(b1);
        dispensador.colocarBandeja(new Bandeja(102, "Preta"));
        dispensador.colocarBandeja(new Bandeja(103, "Preta"));
        dispensador.colocarBandeja(new Bandeja(104, "Preta"));
        dispensador.retirarBandeja();
        dispensador.retirarBandeja();
        dispensador.colocarBandeja(new Bandeja(105, "Preta"));
        dispensador.colocarBandeja(new Bandeja(106, "Preta"));
        dispensador.colocarBandeja(new Bandeja(107, "Preta"));
    }
}
