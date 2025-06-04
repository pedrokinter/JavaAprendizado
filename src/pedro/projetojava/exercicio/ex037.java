package pedro.projetojava.exercicio;

import java.util.Arrays;
import java.util.Scanner;

public class ex037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[5];
        int[] vetor2 = new int[5];
        int[] vetor3 = new int[10];
        System.out.println("Digite o primeiro vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(vetor));
        System.out.println("=====================");
        System.out.println("Digite o segundo vetor: ");
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(vetor2));
        System.out.println("===================");

        // desse jeito, ele multiplica i por 2 (no começo é 0)
        // depois multiplica i por 2 + 1
        // logo, fica 0 e 1, e vai aumentando
        for (int i = 0; i < 5; i++) {
            vetor3[2*i] = vetor[i];
            vetor3[2*i+1] = vetor2[i];
        }
        // porem desse jeito é bem mais facil
        // pq ele vai adicionado pela variavel pos, sem afetar nada de dentro, assim formando a sequencia direitinho
        // e a variavel pos continua aumentando, por isso que intercala certinho
        int pos = 0;
        for (int i = 0; i < 5; i++) {
            vetor3[pos++] = vetor[i];
            vetor3[pos++] = vetor2[i];
        }

        for (int i : vetor3) {
            System.out.println(Arrays.toString(vetor3));
            break;
        }
    }
}
