package pedro.ProjetoJava.javacore.Bintroduçaometodos.EXERCICIOS;

import pedro.ProjetoJava.javacore.Bintroduçaometodos.dominioExercicios.Inss008;

import java.util.Scanner;

public class Ex008voltaramanha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Inss008 funcionario = new Inss008();
        Inss008 funcionario2 = new Inss008();

        double aliquota = 0;
        double parcela = 0;

        System.out.println("Digite o nome do primeiro funcionário: ");
        funcionario.nome = entrada.next();

        System.out.println("Digite o salário bruto do primeiro funcionário: ");
        funcionario.salarioBruto = entrada.nextDouble();

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        System.out.println("Digite o nome do  segundo funcionário: ");
        funcionario2.nome = entrada.next();

        System.out.println("Digite o salário bruto do segundo funcionário: ");
        funcionario2.salarioBruto = entrada.nextDouble();

        if (funcionario.salarioBruto <= 1518 || funcionario2.salarioBruto <= 1518) {
            aliquota = 0.075;
        } else if (funcionario.salarioBruto > 1518 && funcionario.salarioBruto <= 2793.88 || funcionario2.salarioBruto > 1518 && funcionario2.salarioBruto <= 2793.88) {
            aliquota = 0.090;
            parcela = 22.77;
        } else if (funcionario.salarioBruto > 2793.88 && funcionario.salarioBruto <= 4190.83 || funcionario2.salarioBruto > 2793.88 && funcionario2.salarioBruto <= 4190.83) {
            aliquota = 0.12;
            parcela = 106.59;
        } else {
            aliquota = 0.14;
            parcela = 190.40;
        }

        funcionario.descontoINSS = funcionario.salarioBruto * aliquota - parcela;

        funcionario2.descontoINSS = funcionario2.salarioBruto * aliquota - parcela;

        System.out.println("=-=-=-=-=-=-=-=-=--=-=-=-=-");

        System.out.println("O " +funcionario.nome+ " Recebe: R$" +funcionario.salarioBruto);
        System.out.print("E com o desconto do INSS, o seu salário liquido é igual a: R$" +funcionario.salarioLiquido());

        System.out.println("\n------------------------------");

        System.out.println("O " +funcionario2.nome+ " Recebe: R$" +funcionario2.salarioBruto);
        System.out.print("E com o desconto do INSS, o seu salário liquido é igual a: R$" +funcionario2.salarioLiquido());

        System.out.println("\n=-=-=-=-=-=-=-=-=-=-");

        if (funcionario.salarioLiquido() > funcionario2.salarioLiquido()) {
            System.out.println(funcionario.nome+ " Tem o maior salário liquido.");
        } else {
            System.out.println(funcionario2.nome+ " Tem o maior salário liquido.");
        }
    }
}
