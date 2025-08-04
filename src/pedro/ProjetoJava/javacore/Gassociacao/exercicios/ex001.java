package pedro.ProjetoJava.javacore.Gassociacao.exercicios;

import pedro.ProjetoJava.javacore.Gassociacao.dominiosExercicios.cursoExercicio01;
import pedro.ProjetoJava.javacore.Gassociacao.dominiosExercicios.professorExercicio01;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome do curso: ");
            cursoExercicio01 curso = new cursoExercicio01(ler.nextLine());

        System.out.println("Digite o nome e a especialidade do professor: ");
            professorExercicio01 professor = new professorExercicio01(ler.nextLine(), ler.nextLine());

        curso.setProfessor(professor);

        System.out.println("Digite a carga horaria do curso:");
            curso.setCargaHoraria(ler.nextLine());

        curso.imprimir();

    }
}
