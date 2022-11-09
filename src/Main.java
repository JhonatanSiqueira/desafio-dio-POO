import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //CRIAÇÃO DO DOS CURSOS/MENTORIA:
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("curso java");
        cursoJava.setDescricao("descrição do curso de java ");
        cursoJava.setCarcaHoraria(8);

        Curso cursoPOO = new Curso();
        cursoPOO.setTitulo("curso Programação Orientado a Objetos");
        cursoPOO.setDescricao("descrição do curso de POO");
        cursoPOO.setCarcaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição da mentoria de java");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);


        //CRIAÇÃO DO BOOTCAMP:
        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Potência Tech powered by iFood - Java Beginners");
        bootcampJava.setDescricao("O iFood chegou na DIO com uma super trilha para pessoas que querem ingressar no mercado tech! O Potência Tech Powered by iFood - Java Beginners já está com inscrições abertas para pessoas de todo o Brasil, mas voltado e focado em grupos sub-representados e pessoas de baixa renda. Uma trilha com conteúdos completos, desafios de projetos, mentorias ao vivo e networking com a comunidade.  Ao final do programa, ainda vai acontecer o Minha Carreira Tech, uma oportunidade de conhecer as empresas parceiras e ficar disponível na plataforma de talentos da DIO e ainda poder ganhar prêmios pelo seu desempenho.");
        bootcampJava.getConteudos().add(cursoJava);
        bootcampJava.getConteudos().add(cursoPOO);
        bootcampJava.getConteudos().add(mentoria);

        //CRIAÇÃO DOS DEVS (ALUNOS) DE CADA CURSO:
        Dev devJhon = new Dev();
        devJhon.setNome("Jhon");    //NOME SETADO
        devJhon.inscreverBootcamp(bootcampJava); //MATRICULADO NO BOOTCAMP
        System.out.println("Conteúdos Inscritos" + devJhon.getConteudosInscritos());
        devJhon.progredir();
        devJhon.progredir(); //PROGREDIU NA DISCIPLINA (+XP)
        System.out.println("Conteúdos Concluídos" + devJhon.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos" + devJhon.getConteudosInscritos());
        System.out.println("XP:" + devJhon.calcularTotalXp()); //EXIBE O XP TOTAL DO ALUNO

        System.out.println("-----------------------------------------------------------");

        Dev devGabriela = new Dev();
        devGabriela.setNome("Gabriela");
        devGabriela.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos Inscritos" + devGabriela.getConteudosInscritos());
        devGabriela.progredir();
        devGabriela.progredir();
        devGabriela.progredir();
        System.out.println("Conteúdos Concluídos" + devGabriela.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos" + devGabriela.getConteudosInscritos());
        System.out.println("XP:" + devGabriela.calcularTotalXp());


}
}