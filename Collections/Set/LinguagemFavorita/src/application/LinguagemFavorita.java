package application;

import java.util.Comparator;

public class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    private String nome;
    private Integer anoDeCriacao;
    private String ide;

    public LinguagemFavorita(){

    }

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(Integer anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    public int compareIDE(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.compareTo(l2);
    }

    @Override
    public int compareTo(LinguagemFavorita l) {
        int nome = this.getNome().compareTo(l.getNome());
        if(nome != 0) return nome;
        int ide= this.getIde().compareTo(l.getIde());
        if(ide != 0) return ide;
        return this.getAnoDeCriacao().compareTo(l.getAnoDeCriacao());
    }
}
