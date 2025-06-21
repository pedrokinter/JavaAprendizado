package pedro.projetojava.javacore.Dconstrutores.EXERCICIOS;

import pedro.projetojava.javacore.Dconstrutores.dominioExercicios.contaBancaria;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome do titular");
            String titular = ler.nextLine();

        System.out.println("Digite o número da conta");
            String numeroConta = ler.nextLine();

        System.out.println("Digite o saldo");
            double saldo = ler.nextDouble();
        ler.nextLine();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        contaBancaria conta =  new contaBancaria(titular, numeroConta, saldo);

        conta.setLimiteSaque(300);

        while(true){
            System.out.println("Você quer Sacar, Sacar (com taxa do seu banco), Depositar, Consultar saldo ou Sair?");
            String opcao = ler.nextLine().toLowerCase();
            if(opcao.equals("sair")){
                break;
            }

            if (opcao.equals("sacar")){
                System.out.println("Digite o quanto você quer sacar (R$): ");
                conta.sacar(ler.nextDouble());
                ler.nextLine();
            } else if (opcao.equals("depositar")){
                System.out.println("Digite o quanto você quer depositar (R$): ");
                conta.depositar(ler.nextDouble());
                ler.nextLine();
            } else if (opcao.equals("sacar com taxa")){
                System.out.println("Digite o quanto você quer sacar e a taxa do seu banco (R$): ");
                conta.sacar(ler.nextDouble(), ler.nextDouble());
                ler.nextLine();
            } else if (opcao.equals("consultar saldo")){
                System.out.println("Saldo atual R$: " + conta.getSaldo());
            }

        }
        ler.close();
        conta.exibirDados();

    }
}
