package pedro.projetojava.javacore.Bintroduçaometodos.EXERCICIOS;

import pedro.projetojava.javacore.Bintroduçaometodos.dominioExercicios.ContaBancaria016;

import java.util.Scanner;

public class Ex016 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ContaBancaria016 conta = new ContaBancaria016();


        System.out.println("Digite os dados da sua conta bancaria abaixo: ");
        System.out.println("Numero da conta: ");
        conta.setNumeroConta(ler.next());

        System.out.println("Nome do titular: ");
        conta.setTitular(ler.next());

        System.out.println("----------------------");


        for (int i = 0; i < 99999; i++){
            System.out.println("Você quer depositar ou sacar o  dinheiro da sua conta? (SAIR para encerrar): ");
            String opcao = ler.next();

            switch (opcao){
                case "depositar":
                    System.out.println("DIGITE O VALOR EM R$ A SER DEPOSITADO: ");
                    conta.depositar(ler.nextDouble());
                    break;
                case "sacar":
                    System.out.println("DIGITE O VALOR EM R$ A SER SACADO: ");
                    conta.sacar(ler.nextDouble());
                    break;
            }
            if (opcao.equals("sair")){
                System.out.println("Ok, vamos encerrar o programa!");
                break;
            }
        }

        System.out.println("---------------------------");
        System.out.println("Numero da conta: "+conta.getNumeroConta());
        System.out.println("Nome do titular: "+conta.getTitular());
        System.out.println("Saldo atual da conta: R$"+conta.getSaldo());

    }
}
