package pedro.ProjetoJava.javacore.Hherança.exerciciosHeranca;

import pedro.ProjetoJava.javacore.Hherança.dominioExercicio.alunoExercicio;
import pedro.ProjetoJava.javacore.Hherança.dominioExercicio.pessoaExercicio;
import pedro.ProjetoJava.javacore.Hherança.dominioExercicio.professorExercicio;

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

        // dava pra declarar um array de PessoaExercicio e percorrer com um for, chamando exibirInformacoes() para mostrar
        // o polimorfismo funcionando (segundo o gpt)

    }
}
