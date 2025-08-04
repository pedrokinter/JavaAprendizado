package pedro.ProjetoJava.javacore.Bintroduçaometodos.EXERCICIOS;


import pedro.ProjetoJava.javacore.Bintroduçaometodos.dominioExercicios.Produto013;

import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Produto013 produto = new Produto013();

        System.out.println("Digite o nome do produto: ");
        produto.nome = entrada.nextLine();

        System.out.println("Digite o preço do produto: ");
        produto.preco = entrada.nextDouble();

        System.out.println("Digite o quantidade do produto: ");
        produto.quantidade = entrada.nextInt();

        System.out.println("----------------------------------");

        for (int i = 0; i < 99999; i++) {
            System.out.println("Você quer adicionar, remover ou calcular (sair do programa) o preço do produto?: ");
            String perg = entrada.next();

            switch (perg) {
                case "adicionar":
                    int add = entrada.nextInt(); // adiciona aqui, e passa como parametro no metodo, retornando os valores
                    System.out.println("Você adicionou " + add + " a mais. O estoque do produto agora é igual a: " +
                            produto.adicionarQtd(add));
                    System.out.println("=-=-=-=-=-=-=-=");
                    continue;

                case "remover":
                    int remover = entrada.nextInt(); // adiciona aqui, e passa como parametro no metodo, retornando os valores
                    System.out.println("Você removeu " + remover + " a menos. O estoque do produto agora é igual a: " +
                            produto.removerQtd(remover));
                    System.out.println("=-=-=-=-=-=-=-=");
                    continue;

                case "calcular":
                    produto.calcularTotal(); // retorna um void printado ja, facil
                    i = 99999;
                    System.out.println("=-=-=-=-=-=-=-=");
                    break;

            }
            if (!perg.equals("sair")) { // se for diferente de sair é invalido, caso for sair ele sai
                System.out.println("Inválido, tente novamente.");
                System.out.println("-------------------------");
            } else {
                break;
            }
        }

        System.out.println("--------------------------");
        System.out.println(produto.exibirDados());

    }
}
