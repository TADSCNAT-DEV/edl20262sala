package br.com.edl20262.aplicacoes.impressoraapp;

public class Trabalho {
    private String codigo;
    private int paginas;

    public Trabalho(String codigo,int paginas){
        this.codigo=codigo;
        this.paginas=paginas;
    }

    public void setCodigo(String codigo){
        this.codigo=codigo;
    }
    public String getCodigo(){
        return this.codigo;
    }

    public void setPaginas(int paginas){
        this.paginas=paginas;
    }

    public int getPaginas(){
        return this.paginas;
    }

    public String toString(){
        return this.codigo+"("+this.paginas+")";
    }

}
