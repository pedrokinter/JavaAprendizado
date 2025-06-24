package pedro.projetojava.javacore.Dconstrutores.EXERCICIOS;

import pedro.projetojava.javacore.Dconstrutores.dominioExercicios.funcionarioEstatico06;

import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        funcionarioEstatico06 funcionario = new funcionarioEstatico06();

        while (true) {
            System.out.println("Digite o nome do funcionário: ");
            funcionario.setNome(entrada.nextLine());

            System.out.println("Digite o cargo do funcionário: ");
            funcionario.setCargo(entrada.nextLine());


            System.out.println("Digite o salario do funcionário: ");
            funcionario.setSalario(entrada.nextDouble());

            entrada.nextLine();
            funcionario.incrementoFuncionarios();

            System.out.println("Deseja sair ou registrar mais?");
            String opcao = entrada.nextLine();

            if (opcao.equals("sair")) {
                break;
            } else if (opcao.equals("registrar")) {
                continue;
            }
        }

        funcionario.imprimirDados();

    }
}
