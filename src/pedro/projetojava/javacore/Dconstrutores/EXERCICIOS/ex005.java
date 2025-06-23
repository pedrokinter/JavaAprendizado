package pedro.projetojava.javacore.Dconstrutores.EXERCICIOS;

import pedro.projetojava.javacore.Dconstrutores.dominioExercicios.alunoCadastro;
import pedro.projetojava.javacore.Dconstrutores.dominioExercicios.cursoCadastro;

import java.util.Arrays;
import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do curso: ");
        String nomeCurso = entrada.nextLine();

        cursoCadastro curso = new cursoCadastro(nomeCurso);
        alunoCadastro aluno = new alunoCadastro();
        System.out.println("Cadastre 5 alunos: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome do aluno: ");
            aluno.setNome(entrada.nextLine());

            System.out.println("Digite a matricula do aluno: ");
            aluno.setMatricula(entrada.nextLine());

            curso.matricularAluno(aluno.getNome(), aluno.getMatricula());
            System.out.println("--------------------");
        }


        curso.exibirAlunos();
    }
}
