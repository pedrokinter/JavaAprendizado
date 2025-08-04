package pedro.ProjetoJava.exercicio;

import java.util.Arrays;
import java.util.Scanner;

public class ex030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matriz = new int[3][3];
        int linha = 0;
        int linha1 = 0;
        int linha2 = 0;

        int coluna = 0;
        int coluna1 = 0;
        int coluna2 = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < matriz.length; i++) {
            coluna += matriz[i][0];
            coluna1 += matriz[i][1];
            coluna2 += matriz[i][2];

            for (int j = 0; j < matriz[i].length; j++) {
                if (i == 0){
                    linha += matriz[i][j];
                } else if (i == 1){
                    linha1 += matriz[i][j];
                }else{
                    linha2 += matriz[i][j];
                }

            }
        }

        System.out.println("=====================");
        for (int[] ints : matriz) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println("A SOMA DA 1 LINHA ACIMA É IGUAL A " +linha);
        System.out.println("A SOMA DA 2 LINHA ACIMA É IGUAL A " +linha1);
        System.out.println("A SOMA DA 3 LINHA ACIMA É IGUAL A " +linha2);
        System.out.println("A SOMA DA 1 COLUNA ACIMA É IGUAL A " +coluna);
        System.out.println("A SOMA DA 2 COLUNA ACIMA É IGUAL A " +coluna1);
        System.out.println("A SOMA DA 3 COLUNA ACIMA É IGUAL A " +coluna2);

    }
}
