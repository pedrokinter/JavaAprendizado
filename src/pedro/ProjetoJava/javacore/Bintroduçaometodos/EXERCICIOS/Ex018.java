package pedro.ProjetoJava.javacore.Bintroduçaometodos.EXERCICIOS;

import pedro.ProjetoJava.javacore.Bintroduçaometodos.dominioExercicios.Livro018;

import java.util.Scanner;

public class Ex018 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Livro018 livro = new Livro018();

        System.out.println("Digite o nome do livro: ");
        livro.setTitulo(entrada.nextLine());

        System.out.println("Digite o autor do livro: ");
        livro.setAutor(entrada.nextLine());

        System.out.println("Digite a quantidade de paginas do livro: ");
        livro.setNumeroPaginas(entrada.nextInt());

        System.out.println("-----------------");
        System.out.println("Nome do livro: " + livro.getTitulo());
        System.out.println("Nome do autor: " + livro.getAutor());
        if (livro.getNumeroPaginas() < 1) {
            System.out.println("ERRO, Valor menor que 0");
        } else {
            System.out.println("Numero de paginas: " + livro.getNumeroPaginas());
        }
        System.out.println("-----------------");
    }
}
