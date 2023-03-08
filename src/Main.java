import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    
        Curso curso = new Curso("Usando Orientação a Objetos em Java", "Descrição Curso Java", 1);
        Mentoria mentoria = new Mentoria("Piramide de Testes e TDD", "Descrição Mentoria Java", LocalDate.now());
        
        Bootcamp bootcamp = new Bootcamp("Banco PAN Java Developer", "Descrição Bootcamp Java Developer");
        bootcamp.adicionarCurso(curso);
        bootcamp.adicionarCurso(mentoria);
        
        Dev devFelipe = new Dev("Felipe");
        devFelipe.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos Felipe:" + devFelipe.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Felipe:" + devFelipe.getConteudosConcluidos());
        System.out.println("XP:" + devFelipe.calcularTotalXp());
        
        bootcamp.adicionarCurso(mentoria);
    }

}
