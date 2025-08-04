package pedro.ProjetoJava.javacore.Dconstrutores.EXERCICIOS;

import pedro.ProjetoJava.javacore.Dconstrutores.dominioExercicios.calculadoraStatic07;

import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite 2 números abaixo, que serão somados, subtraidos, multiplicados e divididos: ");

        System.out.println("N1: ");
            int num1 = entrada.nextInt();

        System.out.println("N2: ");
            int num2 = entrada.nextInt();
        entrada.nextLine();

        System.out.println("----------------------");

        System.out.println("A soma dos valores é igual a: " + calculadoraStatic07.somar(num1, num2));
        System.out.println("A subtração dos valores é igual a: " + calculadoraStatic07.subtrair(num1, num2));
        System.out.println("A multiplicação dos valores é igual a: " + calculadoraStatic07.multiplicar(num1, num2));
        System.out.println("A divisao dos valores é igual a: " + calculadoraStatic07.dividir(num1, num2));

    }
}
