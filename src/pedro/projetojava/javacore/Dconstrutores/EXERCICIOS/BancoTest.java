package pedro.projetojava.javacore.Dconstrutores.EXERCICIOS;

import pedro.projetojava.javacore.Dconstrutores.dominioExercicios.Banco;

import java.util.Scanner;

public class BancoTest {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        String pergunta = "";

        System.out.println("Digite o nome do titular e o saldo: ");
            Banco banco = new Banco(entrada.nextLine(), entrada.nextDouble());

        System.out.println("Digite o nome do segundo titular e o saldo: ");
            Banco banco2 = new Banco(entrada.nextLine(), entrada.nextDouble());

        while (contador != -1){
            System.out.println(banco.getTitular() + "Você quer depositar, sacar ou sair?");
            contador++;
            pergunta = entrada.nextLine();
            switch (pergunta) {
                case "depositar":
                    banco.depositar(entrada.nextDouble());
                    break;

                case "sacar":
                    System.out.println(banco.sacar(entrada.nextDouble()));
                    break;
            }
            if (pergunta.equals("sair")) {
                break;
            }
        }

        System.out.println(banco.getTitular() + " Transfira da sua conta para outra: ");
            banco.transferir(banco2, entrada.nextDouble());

        System.out.println("====================");

            System.out.println("nome: " + banco.getTitular());
            System.out.println("saldo: " + banco.getSaldo());

        System.out.println("-------------");

            System.out.println("nome 2:  " + banco2.getTitular());
            System.out.println("saldo 2: " + banco2.getSaldo());

    }
}
