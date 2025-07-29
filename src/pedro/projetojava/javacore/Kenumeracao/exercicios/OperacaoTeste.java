package pedro.projetojava.javacore.Kenumeracao.exercicios;

import pedro.projetojava.javacore.Kenumeracao.dominioExercicios.OperacaoMatematica;

import java.util.Scanner;

public class OperacaoTeste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite 2 valores a serem somados, subtraidos, multiplicados ou divididos: ");
        while (true) {
            System.out.println("valor 1: ");
            int valor1 = entrada.nextInt();
            System.out.println("valor 2: ");
            int valor2 = entrada.nextInt();

            System.out.println("voce quer somar, subtrair, multiplicar, dividir: ");
            String operacao = entrada.next().toLowerCase();
            switch (operacao) {
                case "somar":
                    System.out.println("A soma dos dois valores é: " + OperacaoMatematica.SOMA.executar(valor1, valor2));
                    break;
                case "subtrair":
                    System.out.println("A subtracao dos dois valores é: " + OperacaoMatematica.SUBTRACAO.executar(valor1, valor2));
                    break;
                case "multiplicar":
                    System.out.println("A multiplicacao dos dois valores é: " + OperacaoMatematica.MULTIPLICACAO.executar(valor1, valor2));
                    break;
                case "dividir":
                    System.out.println("A divisao dos dois valores é: " + OperacaoMatematica.DIVISAO.executar(valor1, valor2));
                    break;
            }
            break;
        }


    }
}
