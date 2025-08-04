package pedro.ProjetoJava.javacore.Bintroduçaometodos.EXERCICIOS;

import pedro.ProjetoJava.javacore.Bintroduçaometodos.dominioExercicios.Aluno010;

import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Aluno010 aluno = new Aluno010();
        Aluno010 aluno2 = new Aluno010();
        System.out.println("=-=-=-=-");
        System.out.println("Abaixo, digite a nota de dois alunos e nome de dois alunos: ");
        System.out.println("Digite o nome e a nota do primeiro: ");
        aluno.nome = entrada.next();
        aluno.nota = entrada.nextDouble();

        System.out.println("Digite o nome e a nota do segundo: ");
        aluno2.nome = entrada.next();
        aluno2.nota = entrada.nextDouble();

        System.out.println("=-=-=-=-");
        aluno.melhorNota(aluno, aluno2);
        System.out.println("-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=--=-=-==");
        System.out.println(aluno.alunoMelhorNota(aluno, aluno2));;
    }
}
