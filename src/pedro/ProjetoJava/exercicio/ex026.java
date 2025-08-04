package pedro.ProjetoJava.exercicio;

import java.util.Scanner;

public class ex026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um 10 valores abaixo e imprimiremos apenas os pares: ");
        int [] numeros = new int [10];
        int n = 0;
        System.out.println("=-=-=-=-=--=");

        for (int i = 0; i < 10; i++) {
            n = sc.nextInt();
            numeros [i] = n;
            // faz com que os numeros vao pra dentro do array

        }

        System.out.println("=-=-=-=-=--=");
        System.out.println("Todos os numeros pares abaixo: ");
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.print(numero + " " );
                // e se o resto da divisao por 2 do numero for 0, ele é par
            }
        }
        System.out.println("=-=-=-=-=--=");
    }
}
