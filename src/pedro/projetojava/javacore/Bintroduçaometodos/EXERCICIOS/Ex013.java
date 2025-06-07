package pedro.projetojava.javacore.Bintroduçaometodos.EXERCICIOS;


import pedro.projetojava.javacore.Bintroduçaometodos.dominioExercicios.Produto013;

import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Produto013 produto = new Produto013();
        int contador = 1;

        System.out.println("Digite o nome do produto: ");
        produto.nome = entrada.nextLine();

        System.out.println("Digite o preço do produto: ");
        produto.preco = entrada.nextDouble();

        System.out.println("Digite o quantidade do produto: ");
        produto.quantidade = entrada.nextInt();

        System.out.println("----------------------------------");
        System.out.println("Você quer adicionar, remover ou calcular o preço do produto?: ");
        String perg = entrada.next();



        switch (perg) {
            case "adicionar":
                int add = entrada.nextInt();
                System.out.println(produto.adicionarQtd(add));


            case "remover":
                int remover = entrada.nextInt();
                System.out.println(produto.removerQtd(remover));
                break;

            case "calcular":
                produto.calcularTotal();
                break;
        }

        System.out.println(produto.exibirDados());

    }
}
