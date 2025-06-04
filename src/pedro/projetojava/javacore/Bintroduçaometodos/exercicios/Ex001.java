package pedro.projetojava.javacore.Bintroduçaometodos.exercicios;

import pedro.projetojava.javacore.Bintroduçaometodos.dominioExercicios.Produto001;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Produto001 produto = new Produto001();
        System.out.println("A seguir, digite o nome e preço do seu produto e daremos o valor final com 10% de desconto: ");
        produto.nome = ler.nextLine();
        produto.preco = ler.nextDouble();
        double resultado = produto.calcularDesconto();

        System.out.println("O valor do seu " +produto.nome+ " sem desconto é igual a: R$" + produto.preco);
        System.out.println("Porém com o desconto de 10%, o " +produto.nome+  " fica igual a: R$" + resultado);


    }
}
