package pedro.ProjetoJava.exercicio;

import java.util.Arrays;
import java.util.Scanner;

public class ex034 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        System.out.println("Digite os numeros de uma matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = ler.nextInt();
            }
        }
        for (int[] ints : matriz) {
            System.out.println(Arrays.toString(ints));

        }
        System.out.println("-=-=-=-=-=-=-=-=-");
        System.out.println("Agora, digite um número para multiplicar a matriz: ");
        int numero = ler.nextInt();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = numero * matriz[i][j];
            }
        }

        for (int[] ints : matriz) {
            System.out.println(Arrays.toString(ints));

        }
        System.out.println("-=-=-=-=-=-=-=-=-");
    }
}
