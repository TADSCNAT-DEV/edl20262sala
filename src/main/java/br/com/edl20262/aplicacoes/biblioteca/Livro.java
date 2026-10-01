package br.com.edl20262.aplicacoes.biblioteca;

public class Livro {
    private int codigo;
    private String titulo;

    public Livro(int codigo, String titulo){
        this.codigo=codigo;
        this.titulo=titulo;
    }

    public int getCodigo(){
        return this.codigo;
    }
    public String getTitulo(){
        return this.titulo;
    }

    public String toString(){
        return this.codigo + " "+this.titulo;
    }
}
