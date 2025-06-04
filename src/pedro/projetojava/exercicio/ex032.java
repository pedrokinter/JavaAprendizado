package pedro.projetojava.exercicio;

import java.util.Arrays;
import java.util.Scanner;

public class ex032 {
    public static void main(String[] args) {
        int [][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                }
            }
        }

        for (int[] ints : matriz) {
            System.out.println(Arrays.toString(ints));

        }
    }
}
