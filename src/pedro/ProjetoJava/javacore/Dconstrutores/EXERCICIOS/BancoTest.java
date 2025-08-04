package pedro.ProjetoJava.javacore.Dconstrutores.EXERCICIOS;

import pedro.ProjetoJava.javacore.Dconstrutores.dominioExercicios.Banco;

import java.util.Scanner;

public class BancoTest {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        String pergunta = "";

        System.out.println("Digite o nome do titular e o saldo: ");
            Banco banco = new Banco(entrada.nextLine(), entrada.nextDouble());

        System.out.println("Digite o nome do segundo titular e o saldo: ");
            Banco banco2 = new Banco(entrada.next(), entrada.nextDouble());


        while (contador != -1){
            contador++;
            System.out.println(banco.getTitular().toUpperCase() + " Você quer depositar, sacar ou sair?");
            pergunta = entrada.nextLine();
            switch (pergunta) {
                case "depositar":
                    System.out.println("Deposite um valor: ");
                    banco.depositar(entrada.nextDouble());
                    break;

                case "sacar":
                    System.out.println("Saque um valor: ");
                    System.out.println(banco.sacar(entrada.nextDouble()));
                    break;
            }
            if (pergunta.equals("sair")) {
                break;
            }
        }

        System.out.println("=--=-=-=-==-=-=-=-=-=-=-=-=-=-=-=");

        System.out.println(banco.getTitular().toUpperCase() + " Transfira  um valor da sua conta para outra: ");
            banco.transferir(banco2, entrada.nextDouble());

        System.out.println("====================");

            System.out.println("Nome: " + banco.getTitular());
            System.out.println("Saldo atual: " + banco.getSaldo());

        System.out.println("-------------");

            System.out.println("Nome 2:  " + banco2.getTitular());
            System.out.println("Saldo 2 atual : " + banco2.getSaldo());

    }
}
