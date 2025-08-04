package pedro.ProjetoJava.exercicio;

import java.util.Arrays;
import java.util.Scanner;

public class ex039 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetor = new int[5];
        int[] vetor1 = new int[5];
        int[] vetorFinal = new int[10];
        System.out.println("Digite abaixo 2 vetores para serem intercalados");
        // pede o primeiro vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = ler.nextInt();
        }
        // pede o segundo vetor
        System.out.println("=-=-=-=-=-=-=");
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = ler.nextInt();

        }
        // aqui a posiçao começa em 9
        int pos = 9;
        for (int i = 0; i < vetorFinal.length; i++) {
            // qnd chegar a -1 ele para o loop
            if (pos == -1){
                break;
            }
            // aqui basicamente a posiçao vai perdendo de 2 em 2, e imprimindo os valores dos vetores de i
            // facil rapido
            vetorFinal[pos--] = vetor[i];
            vetorFinal[pos--] = vetor1[i];

        }

        for (int i : vetorFinal) {
            System.out.println(Arrays.toString(vetorFinal));
            break;
        }
    }
}
