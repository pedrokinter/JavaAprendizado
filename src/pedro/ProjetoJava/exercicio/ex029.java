package pedro.ProjetoJava.exercicio;

import java.util.Scanner;

public class ex029 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int [][] matriz = new int[4][4];
        int par = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = ler.nextInt();
                if (matriz[i][j] % 2 == 0) {
                    par += 1;

                }
            }
        }
        System.out.println("=-=-=-=-=-=");
        System.out.println("Na matriz 4x4 acima, existem " + par + " numeros pares");
        System.out.println("Sendo eles: " );
        for (int[] numeros : matriz) {
            for (int numero : numeros) {
                if (numero % 2 == 0) {
                    System.out.print(numero + " ");
                }
            }

        }
        System.out.println(" ");
        System.out.println("=-=-=-=-=-=-=-");
    }
}
