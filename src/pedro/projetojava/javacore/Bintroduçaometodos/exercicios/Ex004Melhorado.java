package pedro.projetojava.javacore.Bintroduçaometodos.exercicios;

import pedro.projetojava.javacore.Bintroduçaometodos.dominioExercicios.AlunoMelhorado004;

import java.util.Arrays;
import java.util.Scanner;

public class Ex004Melhorado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        AlunoMelhorado004 aluno = new AlunoMelhorado004();

        System.out.println("Digite o nome do aluno: ");
        aluno.nome = entrada.next();

        System.out.println("Digite quantas notas o aluno teve: "); // vai adicionar a qntd de posiçao do array
        aluno.qntdNotas = entrada.nextInt();
        aluno.notas = new int [aluno.qntdNotas];

        System.out.println("Agora, digite as notas do aluno: ");

        for (int i = 0; i < aluno.notas.length; i++) {
            aluno.notas[i] = entrada.nextInt();
        }

        System.out.println("======================");

        System.out.println("O nome do aluno é: " + aluno.nome);
        System.out.println("A quantidade de notas que ele teve é igual a: " + aluno.notas.length);
        System.out.println("Sendo elas: " + Arrays.toString(aluno.notas));
        System.out.println("E a média final delas é igual a: " + aluno.mediaFinal());

        System.out.println("======================");

    }
}
