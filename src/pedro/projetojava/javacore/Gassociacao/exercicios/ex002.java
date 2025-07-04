package pedro.projetojava.javacore.Gassociacao.exercicios;

import pedro.projetojava.javacore.Gassociacao.dominiosExercicios.escolaExercicio02;
import pedro.projetojava.javacore.Gassociacao.dominiosExercicios.estudanteExercicio02;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome da escola: ");
        escolaExercicio02 escola = new escolaExercicio02(ler.nextLine());

        estudanteExercicio02 estudante = new estudanteExercicio02("Pedro", 11);

        estudanteExercicio02[] estudantes = {estudante};

        estudante.setEscola(escola);

        escola.setEstudantes(estudantes);

        System.out.println("===============================");

        estudante.exibirEstudante();

        escola.exibirEscola();

    }
}
