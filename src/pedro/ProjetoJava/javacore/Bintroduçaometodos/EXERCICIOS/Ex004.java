package pedro.ProjetoJava.javacore.Bintroduçaometodos.EXERCICIOS;

import pedro.ProjetoJava.javacore.Bintroduçaometodos.dominioExercicios.Aluno004;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Aluno004 aluno = new Aluno004();
        System.out.println("Digite o nome do aluno: ");
        aluno.nome = ler.next();
        System.out.println("Digite 2 notas do aluno a seguir: ");
        System.out.println("Nota 1: ");
        aluno.nota1 = ler.nextDouble();
        System.out.println("Nota 2: ");
        aluno.nota2 = ler.nextDouble();

        System.out.println("O nome do aluno é igual a: " + aluno.nome);
        System.out.println("E sua média final é igual a: " + aluno.mediaFinal());

    }
}
