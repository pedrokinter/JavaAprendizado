package pedro.projetojava.javacore.Dconstrutores.EXERCICIOS;

import pedro.projetojava.javacore.Dconstrutores.dominioExercicios.alunoCadastro;
import pedro.projetojava.javacore.Dconstrutores.dominioExercicios.cursoCadastro;

import java.util.Arrays;
import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String opcao;
        System.out.println("Digite o nome do curso: ");
        String nomeCurso = entrada.nextLine();

        cursoCadastro curso = new cursoCadastro(nomeCurso);
        alunoCadastro aluno = new alunoCadastro();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        System.out.println("Cadastre 5 alunos abaixo.");
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome do aluno: ");
            aluno.setNome(entrada.nextLine());

            System.out.println("Digite a matricula do aluno: ");
            aluno.setMatricula(entrada.nextLine());

            curso.matricularAluno(aluno);
            System.out.println("--------------------");
        }

        curso.exibirAlunos();


        while(true){
            System.out.println("Você quer adicionar um novo aluno no lugar de algum ja existente?: ");
            opcao = entrada.nextLine();
            if (opcao.equals("sim".toLowerCase())){
                System.out.println("Digite qual é a posiçao do aluno que você quer trocar: ");
                    int posicaoAluno = entrada.nextInt();
                    entrada.nextLine();
                    curso.setIndice(posicaoAluno);
                     // arrumar o bug, quando o a posiçao do aluno for maior que 5 é pra ele voltar o programa
                System.out.println("Digite o nome do aluno: ");
                    String nomeAluno = entrada.nextLine();

                System.out.println("Digite a matricula do aluno: ");
                    String matriculaNova = entrada.nextLine();

                curso.matricularAluno(nomeAluno, matriculaNova);
            } else if (opcao.equals("nao".toLowerCase())){
                break;
            }
        }


        curso.exibirAlunos();
    }
}
