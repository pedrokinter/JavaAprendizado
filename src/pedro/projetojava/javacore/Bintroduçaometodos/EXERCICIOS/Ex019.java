package pedro.projetojava.javacore.Bintroduçaometodos.EXERCICIOS;

import pedro.projetojava.javacore.Bintroduçaometodos.dominioExercicios.Alunozao019;

import java.util.Scanner;

public class Ex019 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Alunozao019 aluno = new Alunozao019();

        System.out.println("Digite o nome do aluno: ");
        aluno.setNome(ler.nextLine());

        System.out.println("Digite a matricula do aluno: ");
        aluno.setMatricula(ler.nextLine());

        System.out.println("Digite as notas do aluno: ");

    }
}
