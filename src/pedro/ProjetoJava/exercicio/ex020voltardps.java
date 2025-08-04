package pedro.ProjetoJava.exercicio;

import java.util.Scanner;

public class ex020voltardps {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = pergunta.nextLine();

        int tamanho = palavra.length(); // eu leio o tamanho da palavra, ex: pedro (5 de tamanho)
        System.out.println("A PALAVRA: " +palavra+ ", escrita ao contrário é igual a: " );

        System.out.println("=-=-=-=-=-=");

        for (int i = 0; i < palavra.length(); i++) { // para i = 0, i menor que a palavra, o i ganha +1
            tamanho -= 1;
            // e aqui o tamanho da palavra perde -1, e isso vai se repetir até o i ficar do tamanho da palavra
            // e quando isso acontecer, o tamanho ja estara zerado e ja vai ter printado todos os caracteres
            System.out.println(palavra.charAt(tamanho));
        }

        System.out.println("=-=-=-=-=-=");
    }
}
