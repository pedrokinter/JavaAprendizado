package pedro.projetojava.javacore.Bintroduçaometodos.exercicios;

import pedro.projetojava.javacore.Bintroduçaometodos.dominioExercicios.ContaBancaria002;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ContaBancaria002 conta = new ContaBancaria002();
        System.out.println("Digite o nome do conta: ");
        conta.titular = ler.nextLine();
        System.out.println("Digite o saldo da conta: ");
        conta.saldo = ler.nextDouble();
        System.out.println("Digite o deposito que você vai fazer: ");
        conta.valorDeposito = ler.nextDouble();
        double resultado = conta.calcularSaldoFinal();
        System.out.println("Nome do titular da conta: " + conta.titular);
        System.out.println("O saldo atual da sua conta éigual a: R$" + conta.saldo);
        System.out.println("Porém, com o novo depósito ele fica igual a : R$" + conta.calcularSaldoFinal());
        System.out.println("====================");
    }
}
