import java.time.LocalDate;

import models.Bootcamp;
import models.Conteudo;
import models.Curso;
import models.Dev;
import models.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Conteudo curso = new Curso("Java begins", "Curso básico de java", 30);
        Conteudo curso2 = new Curso("Java acho que estou entendendo", "Curso básico de java 2", 40);
        Conteudo curso3 = new Curso("Java parece que voltei pro começo", "Curso básico de java 3", 60);
        Conteudo mentoria = new Mentoria("Vocês não estão sozinhos", "Chorando pitanga", LocalDate.of(2024, 3, 20));
        Bootcamp bootcamp = new Bootcamp("Java for dummies", "Bootcamp introdutório da linguagem");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria);
        Dev dev1 = new Dev("Claiton");
        Dev dev2 = new Dev("Jairo");

        dev1.inscreverBootcamp(bootcamp);
        dev2.inscreverBootcamp(bootcamp);

        dev1.progredir();
        dev1.progredir();
        dev2.progredir();

        // for (Conteudo conteudo : dev1.getConteudosInscritos()) {
        //     System.out.println(conteudo.toString());
        // }

        System.out.printf("Dev: %s XP = %.2f pontos\n",dev1.getNome(), dev1.calcularXPTotal());
        System.out.printf("Dev: %s XP = %.2f pontos\n",dev2.getNome(), dev2.calcularXPTotal());
        
    }
}
