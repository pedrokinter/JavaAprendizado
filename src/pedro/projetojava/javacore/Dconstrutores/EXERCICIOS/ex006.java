package pedro.ProjetoJava.javacore.Dconstrutores.EXERCICIOS;

import pedro.ProjetoJava.javacore.Dconstrutores.dominioExercicios.funcionarioEstatico06;

import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        while (true) {
            funcionarioEstatico06 funcionario = new funcionarioEstatico06(); // cria um novo objeto a cada loop (dica gpt)
            System.out.println("Digite o nome do funcionário: ");
            funcionario.setNome(entrada.nextLine());

            System.out.println("Digite o cargo do funcionário: ");
            funcionario.setCargo(entrada.nextLine());


            System.out.println("Digite o salario do funcionário: ");
            funcionario.setSalario(entrada.nextDouble());

            entrada.nextLine();

            System.out.println("Deseja sair ou registrar mais?");
            String opcao = entrada.nextLine();

            if (opcao.equals("sair")) {
                funcionario.imprimirDados();
                break;
            } else if (opcao.equals("registrar")) {
                continue;
            }
        }



    }
}
