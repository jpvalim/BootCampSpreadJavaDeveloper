import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso Java","Descricção curso java",8);
        Curso curso2 = new Curso("Curso Js","Descricção curso js",4);

        Mentoria mentoria = new Mentoria("Mentoria de java","Descricao mentoria java", LocalDate.now() );

        BootCamp bootCamp = new BootCamp("BootCamp Java Developer","Descricao BootCamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev("Camila");

        devCamila.increverBootCamp(bootCamp);
        System.out.println("Conteudos inscrito: " + devCamila.getConteudosIncritos());
        System.out.println("-->");
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();

        System.out.println("Conteudos concluídos: " + devCamila.getConteudosConcluidos());
        System.out.println("Conteudos inscrito: " + devCamila.getConteudosIncritos());
        System.out.println("XP: " + devCamila.calcularXp());
        System.out.println("-----------------");

        Dev devJoao = new Dev("João");
        devJoao.increverBootCamp(bootCamp);
        System.out.println("Conteudos inscrito: " + devJoao.getConteudosIncritos());
        System.out.println("-->");
        devJoao.progredir();

        System.out.println("Conteudos concluídos: " + devJoao.getConteudosConcluidos());
        System.out.println("Conteudos inscrito: " + devCamila.getConteudosIncritos());
        System.out.println("XP: " + devJoao.calcularXp());

    }
}
