package pedro.projetojava.exercicio;

import java.util.Arrays;
import java.util.Scanner;

public class ex042derretitotal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int [] vetor = new int[6];
        int [] vetor2 = new int[6];
        int [] vetor3 = new int[12];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = ler.nextInt();
        }

        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = ler.nextInt();
        }
        int pos = 0;
        int j = 0;
        int k = 0;
       while (k < vetor.length || j < vetor2.length) {
           while (k <   6 && pos < 12){
               if (vetor[k] % 2 == 0 ){
                   vetor3[pos++] = vetor[k];
               }
               k++;
           }

           while (j < 6 && pos < 12){
               if (vetor2[j] % 2 == 1 ) {
                   vetor3[pos++] = vetor2[j];
               }
               j++;
           }
       }

       for (int i : vetor3) {
            System.out.println(Arrays.toString(vetor3));
            break;
       }
    }
}
