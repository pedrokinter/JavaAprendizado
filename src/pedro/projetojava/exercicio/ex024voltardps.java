package pedro.projetojava.exercicio;

import java.util.Arrays;
import java.util.Scanner;

public class ex024voltardps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 5 valores a seguir, onde será dito o Maior e o Menor valor: ");
        int numeros = 0;
        int [] valores = new int[5];
        int valor = 0;
        for (int i = 0; i < 5; i++) {
            valor = sc.nextInt();
            numeros = valores[i] = valor;
        }

        int maior = valores[0];
        int menor = valores[0];
        // aqui eu crio uma variavel de menor e maior valor que serão o primeiro número, independente do numero q seja
        for (int j = 1; j < 5; j++) {
            if (valores[j] < menor) {
                menor = valores[j];
                // pq ai se o numero do array na posição J for menor do que o primeiro número do array, ele atualiza a variável
                // então se o array for (1,2,3,4,5) ele nunca vai mudar, pq nunca vai ser menor
                // mas se for (2,3,5,1,7), ele vai ficar mudando até chegar em 1, e depois de 1 não muda, pq não é menor mais.

            }
            if (valores[j] > maior) {
                maior = valores[j];

                // mesma logica que a de cima, só que com valores MAIORES

            }
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        System.out.println("Os valores do array são: " + Arrays.toString(valores));
        System.out.println("Onde, o menor valor é igual a: " +menor);
        System.out.println("E o maior valor é igual a: " +maior);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }
}
