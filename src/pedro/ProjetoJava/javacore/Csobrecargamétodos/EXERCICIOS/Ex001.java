package pedro.ProjetoJava.javacore.Csobrecargamétodos.EXERCICIOS;

import pedro.ProjetoJava.javacore.Csobrecargamétodos.dominioExercicios.produto001;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        produto001 produto = new produto001();
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        String perg = "";

        System.out.println("Digite o nome do seu produto: ");
        produto.setNome(entrada.nextLine());

        System.out.println("Digite o preço do seu produto: ");
        produto.setPreco(entrada.nextDouble());

        System.out.println("Digite a quantidade em estoque: ");
        produto.setQuantidadeEmEstoque(entrada.nextInt());

        while (contador != -1){

            System.out.println("Adicione ou remova o estoque do seu produto: (adicionar/remover/sair)");
            perg = entrada.nextLine().toLowerCase();
            contador++;
            switch (perg) {
                case "adicionar":
                    System.out.println("Adicione mais ao seu estoque: ");
                    produto.adicionarEstoque(entrada.nextInt());
                    break;

                case "remover":
                    System.out.println("Remova do seu estoque: ");
                    produto.removerEstoque(entrada.nextInt());
                    break;
                }
            if (perg.equals("sair")) {
                break;
            }
        }
        System.out.println("---------------------------");
        produto.exibirDetalhes();

    }
}
