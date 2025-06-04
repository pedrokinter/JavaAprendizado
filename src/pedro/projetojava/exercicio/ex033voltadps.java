package pedro.projetojava.exercicio;

import java.util.Arrays;
import java.util.Scanner;

public class ex033voltadps {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        // preciso fazer uma matriz e dps transcrever linha por coluna
        // 1 2 3
        // 4 5 6
        // 7 8 9

        // ai vira:
        // 1 4 7
        // 2 5 8
        // 3 6 9

        int [][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = ler.nextInt();
            }
        }
        int [][] matriz2 = new int[3][3];
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz2[i][j] = matriz[j][i];
                // aqui eu criei uma nova matriz com as mesmas 10 posiçoes, e percorri a antiga invertendo
                // entao quando i = 0, o j vai aumentando e trocando de lugar com o I da matriz nova
            }
        }

        for (int[] ints : matriz2) {
            System.out.println(Arrays.toString(ints));

        }

    }
}
