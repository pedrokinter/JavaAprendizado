package pedro.ProjetoJava.javacore.Dconstrutores.EXERCICIOS;

import pedro.ProjetoJava.javacore.Dconstrutores.dominioExercicios.Funcionario03;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite nome, cargo e salário base do seu funcionário: ");
        Funcionario03 funcionario = new Funcionario03(ler.nextLine(), ler.nextLine(), ler.nextDouble());

        System.out.println("Calcule o salário dele: ");
            System.out.println("R$" + funcionario.calcularSalario());
        System.out.println("Agora, de o bonus: ");
            System.out.println("R$" + funcionario.calcularSalario(ler.nextDouble()));
        System.out.println("Agora, de o bonus e o desconto dele: ");
            System.out.println("R$" + funcionario.calcularSalario(ler.nextDouble(), ler.nextDouble()));

        funcionario.imprimirFuncionario();
    }
}
