package br.com.edl20262.estruturas;

public class ArvoreBinaria {

    private static class No {
        int valor;
        No esq, dir;
        No(int valor) { this.valor = valor; }
    }
    private No raiz;

    public boolean inserir(int valor) {
        if (raiz == null) {
            raiz = new No(valor);
            return true;
        }
        No atual = raiz;
        while (true) {
            if (valor == atual.valor) {
                return false;
            }
                
            if (valor < atual.valor) {
                if (atual.esq == null) {
                    atual.esq = new No(valor);
                    return true;
                }
                atual = atual.esq;
            } else {
                if (atual.dir == null) {
                    atual.dir = new No(valor);
                    return true;
                }
                atual = atual.dir;
            }
        }
    }

    public boolean contem(int valor) {
        No atual = raiz;
        while (atual != null) {
            if (valor == atual.valor) return true;
            atual = valor < atual.valor ? atual.esq : atual.dir;
        }
        return false;
    }

    public int procuraVersao(int valor){
        No atual=raiz;
        int versao=raiz.valor;
        while (atual != null) {
            if(atual.valor<valor)
                versao=atual.valor;
            atual = valor < atual.valor ? atual.esq : atual.dir;
        }
        return versao;
    }

    public boolean remover(int valor) {
        if (!contem(valor)) return false;
        raiz = remover(raiz, valor);
        return true;
    }
    private No remover(No n, int valor) {
        if (valor < n.valor) {
            n.esq = remover(n.esq, valor);
        } else if (valor > n.valor) {
            n.dir = remover(n.dir, valor);
        } else {
            if (n.esq == null) return n.dir;
            if (n.dir == null) return n.esq;
            No sucessor = n.dir;
            while (sucessor.esq != null)
                sucessor = sucessor.esq;
            n.valor = sucessor.valor;
            n.dir = remover(n.dir, sucessor.valor);
        }
        return n;
    }

    public int tamanho() { return contar(raiz); }
    private int contar(No n) {
        if (n == null) return 0;
        return 1 + contar(n.esq) + contar(n.dir);
    }
    public int altura() { return altura(raiz); }
    private int altura(No n) {
        if (n == null) return -1;
        return 1 + Math.max(altura(n.esq), altura(n.dir));
    }

    public String percurso(String tipo) {
        if (!tipo.equals("PRE") && !tipo.equals("EM")
                && !tipo.equals("POS"))
            throw new IllegalArgumentException("Percurso invalido");
        StringBuilder s = new StringBuilder();
        percorrer(raiz, tipo, s);
        return s.length() == 0 ? "VAZIA" : s.toString();
    }
    private void escrever(No n, StringBuilder s) {
        if (s.length() > 0) s.append(' ');
        s.append(n.valor);
    }
    private void percorrer(No n, String tipo, StringBuilder s) {
        if (n == null) return;
        if (tipo.equals("PRE")) escrever(n, s);
        percorrer(n.esq, tipo, s);
        if (tipo.equals("EM")) escrever(n, s);
        percorrer(n.dir, tipo, s);
        if (tipo.equals("POS")) escrever(n, s);
    }

    public String largura() {
        if (raiz == null) return "VAZIA";
        No[] fila = new No[tamanho()];
        int inicio = 0, fim = 0;
        fila[fim++] = raiz;
        StringBuilder s = new StringBuilder();
        while (inicio < fim) {
            No n = fila[inicio++];
            escrever(n, s);
            if (n.esq != null) fila[fim++] = n.esq;
            if (n.dir != null) fila[fim++] = n.dir;
        }
        return s.toString();
    }

}
