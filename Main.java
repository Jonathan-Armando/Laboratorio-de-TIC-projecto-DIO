import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJonathan = new Dev();
        devJonathan.setNome("Jonathan");
        devJonathan.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos "+devJonathan.getNome()+":\n" + devJonathan.getConteudosInscritos());
        devJonathan.progredir();
        devJonathan.progredir();
        System.out.println("\nConteúdos Inscritos "+devJonathan.getNome()+":\n" + devJonathan.getConteudosInscritos());
        System.out.println("\nConteúdos Concluídos "+devJonathan.getNome()+":\n" + devJonathan.getConteudosConcluidos());
        System.out.println("\nXP:" + devJonathan.calcularTotalXp());

        System.out.println("---------------------------------------------------------------------------------------------------------");

        Dev devMalungo = new Dev();
        devMalungo.setNome("Malungo");
        devMalungo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos "+ devMalungo.getNome() +":\n" + devMalungo.getConteudosInscritos());
        devMalungo.progredir();
        devMalungo.progredir();
        devMalungo.progredir();
  
        System.out.println("\nConteúdos Inscritos "+ devMalungo.getNome() +":\n" + devMalungo.getConteudosInscritos());
        System.out.println("\nConteúdos Concluidos "+ devMalungo.getNome() +":\n" + devMalungo.getConteudosConcluidos());
        System.out.println("\nXP:" + devMalungo.calcularTotalXp());

    }

}
