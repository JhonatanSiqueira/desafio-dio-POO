package br.com.dio.desafio.dominio;

public class Curso {
    private String titulo;
    private String descricao;
    private int carcaHoraria;

    public Curso(){
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCarcaHoraria() {
        return carcaHoraria;
    }

    public void setCarcaHoraria(int carcaHoraria) {
        this.carcaHoraria = carcaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", carcaHoraria=" + carcaHoraria +
                '}';
    }
}
