package pedro.projetojava.javacore.Dconstrutores.EXERCICIOS;

import pedro.projetojava.javacore.Dconstrutores.dominioExercicios.calculadoraStatic07;

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

        calculadoraStatic07.somar(num1, num2);
        calculadoraStatic07.subtrair(num1, num2);
        calculadoraStatic07.multiplicar(num1, num2);
        calculadoraStatic07.dividir(num1, num2);

    }
}
