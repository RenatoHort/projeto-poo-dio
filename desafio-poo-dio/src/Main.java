import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.util.Scanner;
import java.time.LocalDate;
//
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do Dev: ");

        String nomeDev1 = input.nextLine();

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

        Dev Dev1 = new Dev();
        Dev1.setNome("Nome1");
        Dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + nomeDev1 + " :" + Dev1.getConteudosInscritos());
        Dev1.progredir();
        Dev1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " + nomeDev1 + " :" + Dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + nomeDev1 + " :"+ Dev1.getConteudosConcluidos());
        System.out.println("XP:" + Dev1.calcularTotalXp());

        System.out.println("-------");

        Dev Dev2 = new Dev();
        Dev2.setNome("Nome2");
        Dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + nomeDev1 + " :"+ Dev2.getConteudosInscritos());
        Dev2.progredir();
        Dev2.progredir();
        Dev2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos :\n"+ nomeDev1 + " :" + Dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos :\n" + nomeDev1 + " :" + Dev2.getConteudosConcluidos());
        System.out.println("XP:\n" + Dev2.calcularTotalXp());

        input.close();
    }
}
