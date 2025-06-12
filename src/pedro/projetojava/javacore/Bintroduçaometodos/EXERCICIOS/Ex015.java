package pedro.projetojava.javacore.Bintroduçaometodos.EXERCICIOS;

import pedro.projetojava.javacore.Bintroduçaometodos.dominioExercicios.Funcionario015;

import java.util.Scanner;

public class Ex015 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Funcionario015 funcionario1 = new Funcionario015();

        System.out.println("Digite os dados do primeiro funcionario (Nome, Idade e Salário respectivamente): ");
        funcionario1.nome = entrada.next();
        funcionario1.idade = entrada.nextInt();
        funcionario1.salarios = new double [3];

        for (int i = 0; i < 3; i++) {
            funcionario1.salarios[i] = entrada.nextInt();
        }
        funcionario1.imprimir();
        System.out.println("=-=-=-=-=-=-=-=-=");
        funcionario1.tirarMedia();




    }
}
