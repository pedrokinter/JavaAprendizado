package pedro.projetojava.exercicio;

import java.util.Arrays;
import java.util.Scanner;

public class ex035 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        // verificar se o vetor é palindromo
        int [] vetor = new int[5];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = ler.nextInt();
        }
        if (vetor[0] == vetor[4] && vetor[1] == vetor[3]){
            System.out.println("Esse é um vetor palindromo, pois quando lido de tras pra frente é igual");
        } else {
            System.out.println("Esse não é um vetor palindromo, não é igual quando lido de tras pra frente");
        }

        for (int i : vetor) {
            System.out.println(Arrays.toString(vetor));
            break;
        }

    }
}
