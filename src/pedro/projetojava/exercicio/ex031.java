package pedro.projetojava.exercicio;

import java.util.Arrays;
import java.util.Scanner;

public class ex031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os números abaixos para serem colocados em uma matriz");
        int [][] matriz = new int[3][3];
        int soma = 0;
        int coluna = 2;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                i = j;
                System.out.print(matriz[i][j] + " ");
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 2; j >= 0; j--) {

            }
        }



        System.out.println("\n=-=-=-=-=");
        for (int[] ints : matriz) {
            System.out.println(Arrays.toString(ints));
            }


    }
}
