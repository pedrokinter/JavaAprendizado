package pedro.ProjetoJava.javacore.Dconstrutores.EXERCICIOS;

import pedro.ProjetoJava.javacore.Dconstrutores.dominioExercicios.Livro02;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do livro e autor: ");
        Livro02 livro = new Livro02(entrada.nextLine(), entrada.nextLine());

        System.out.println("--------------");

        System.out.println("Agora, digite o número de paginas: ");
        livro.setNumeroPaginas(entrada.nextInt());

        System.out.println("--------------");

        livro.imprimir();
    }
}
