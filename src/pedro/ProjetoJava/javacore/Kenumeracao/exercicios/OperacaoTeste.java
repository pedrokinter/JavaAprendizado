package pedro.ProjetoJava.javacore.Kenumeracao.exercicios;

import pedro.ProjetoJava.javacore.Kenumeracao.dominioExercicios.OperacaoMatematica;

import java.util.Scanner;

public class OperacaoTeste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite 2 valores a serem somados, subtraidos, multiplicados ou divididos: ");
        while (true) {
            System.out.println("valor 1: ");
            double valor1 = entrada.nextInt();
            System.out.println("valor 2: ");
            double valor2 = entrada.nextInt();

            System.out.println("voce quer SOMA, SUBTRAÇAO, MULTIPLICAÇÃO, DIVISAO: ");
            OperacaoMatematica operacao = OperacaoMatematica.valueOf(entrada.next().toUpperCase());
            System.out.println("Resultado: " + operacao.executar(valor1, valor2));

            System.out.println("Deseja continuar? (SIM/NAO)");
            if (entrada.next().equalsIgnoreCase("nao")){
                break;
            }
        }


    }
}
