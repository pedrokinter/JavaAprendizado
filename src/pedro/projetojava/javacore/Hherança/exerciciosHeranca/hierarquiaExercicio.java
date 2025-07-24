package pedro.projetojava.javacore.Hherança.exerciciosHeranca;

import pedro.projetojava.javacore.Hherança.dominioExercicio.alunoExercicio;
import pedro.projetojava.javacore.Hherança.dominioExercicio.pessoaExercicio;
import pedro.projetojava.javacore.Hherança.dominioExercicio.professorExercicio;

public class hierarquiaExercicio {
    public static void main(String[] args) {
        pessoaExercicio pessoa = new pessoaExercicio("Pessoa", "540.651.858-58");
        alunoExercicio aluno = new alunoExercicio("Aluno", "323.323.345.56", "matriculado em 2019");
        professorExercicio professor = new professorExercicio("Professor", "555.651.123-09", 2000);

        pessoa.exibirInformacoes();
        System.out.println("=-=-==-=-==-=-==-=-==-=-==-=-=");
        aluno.exibirInformacoes();
        System.out.println("=-=-==-=-==-=-==-=-==-=-==-=-=");
        professor.exibirInformacoes();
        System.out.println("=-=-==-=-==-=-==-=-==-=-==-=-=");


    }
}
