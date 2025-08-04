package pedro.ProjetoJava.javacore.Bintroduçaometodos.EXERCICIOS;

import pedro.ProjetoJava.javacore.Bintroduçaometodos.dominioExercicios.Alunozao019;

import java.util.Scanner;

public class Ex019 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Alunozao019 aluno = new Alunozao019();
        Alunozao019 aluno2 = new Alunozao019();

        System.out.println("==================================");

            System.out.println("Digite o nome do primeiro aluno: ");
            aluno.setNome(ler.nextLine());

            System.out.println("Digite a matricula do primeiro aluno: ");
            aluno.setMatricula(ler.nextLine());

            System.out.println("Digite as notas do primeiro aluno: ");
            for (int i = 0; i < 3; i++) {
                aluno.adicionarNota(ler.nextDouble());
            }
            ler.nextLine(); // limpa o buffer antes de pedir o nome do segundo aluno, ai n da erro

        System.out.println("=======================================");

            System.out.println("Digite o nome do segundo aluno: ");
            aluno2.setNome(ler.nextLine());

            System.out.println("Digite a matricula do segundo aluno: ");
            aluno2.setMatricula(ler.nextLine());

            System.out.println("Digite as notas do segundo aluno: ");
            for (int i = 0; i < 3; i++) {
                aluno2.adicionarNota(ler.nextDouble());
            }

        System.out.println("---------------");

            aluno.imprimir();
            System.out.println("Média do Aluno: " + aluno.getMedia());
            System.out.println("Situação do Aluno: " + aluno.getSituacao());

        System.out.println("---------------");

            aluno2.imprimir();
            System.out.println("Média do Aluno: " + aluno2.getMedia());
            System.out.println("Situação do Aluno: " + aluno2.getSituacao());

        System.out.println("---------------------------");
        /// ////////////////////////////
    }
}
