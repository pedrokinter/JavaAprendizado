package pedro.projetojava.exercicio;

import java.util.Scanner;
import java.util.Arrays;


public class ex027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe os elementos de um array abaixo: ");
        int elementos = sc.nextInt();
        int numeros = 0;
        int soma = 0;
        int media = 0;
        int[] array = new int[elementos]; // cria o array com o numero informado

        System.out.println("Informe os valores: ");
        for (int i = 0; i < elementos; i++) {

            numeros = sc.nextInt();
            array[i] = numeros;
            soma += array[i];
            media = soma / elementos;
            // armazena os numeros no array, depois faz a soma receber os numeros do array e ir somando todos
            // e dps faz a media, simples.
        }
        System.out.println("A Soma dos elementos do array " + Arrays.toString(array)+ " é igual a " +soma);
        System.out.println("E a média aritmética dos elemtentos é igual a " +media);
        // esse array to string serve pra printar o array dentro do print bonitinho
    }
}
