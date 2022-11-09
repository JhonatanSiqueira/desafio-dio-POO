package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    private String titulo;
    private String descricao;
    private int carcaHoraria;

    @Override
    public double calcularXp() {
        return XP_Inicial * carcaHoraria;
    }

    public Curso(){
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
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", carcaHoraria=" + carcaHoraria +
                '}';
    }


}
