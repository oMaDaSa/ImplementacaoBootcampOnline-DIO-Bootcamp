import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Professor profMatheus = new Professor("Matheus");

        Curso curso1 = new Curso("curso java", "descrição curso java", profMatheus, 8);

        Curso curso2 = new Curso("curso js", "descrição curso js", profMatheus,4);

        Mentoria mentoria = new Mentoria("mentoria de java", "descrição mentoria java", profMatheus, LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:");
        devCamila.getConteudosInscritos().forEach(System.out::println);
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-------");
        System.out.println("Conteúdos Inscritos Camila:");
        devCamila.getConteudosInscritos().forEach(System.out::println);
        System.out.println("Conteúdos Concluídos Camila:");
        devCamila.getConteudosConcluidos().forEach(System.out::println);
        System.out.println("XP:" + devCamila.calcularTotalXp());
        System.out.println("-------");

        Dev devJoao = new Dev("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:");
        devJoao.getConteudosInscritos().forEach(System.out::println);
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-------");
        System.out.println("Conteúdos Inscritos João:");
        devJoao.getConteudosInscritos().forEach(System.out::println);
        System.out.println("Conteúdos Concluídos João:");
        devJoao.getConteudosConcluidos().forEach(System.out::println);
        System.out.println("XP:" + devJoao.calcularTotalXp());

        System.out.println("-------");
        System.out.println("Conteúdos ministrados por Matheus:");
        profMatheus.getConteudos().forEach(System.out::println);
    }

}
