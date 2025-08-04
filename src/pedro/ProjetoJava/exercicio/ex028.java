package pedro.ProjetoJava.exercicio;

import java.util.Arrays;
import java.util.Scanner;

public class ex028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matriz = new int[3][3];
        int soma = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = sc.nextInt();
                soma += matriz[i][j];
                // sempre lembrar que enquanto o j nao chegar a 3, o i não conta
                // entao oq ta acontecendo:
                // i = 0, ai o j = 0  e pergunta o numero da posiçao i (0) j(0) , ai dps o j = 1
                // ai pergunta o numero da posicao i (0) j (1)
                // dps i (0) j (2) etc
                // quando j for igual a 3, ele para e soma o i
                // ai fica i (1) j (0) e vai continuando até chegar no limite de tamanho que é 3x3 (9)

            }
        }
        System.out.println("=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("A matriz abaixo composta por 9 números: ");
        for (int[] numeros : matriz) {
            System.out.println(Arrays.toString(numeros));
        }
        System.out.println("Tem uma soma dos valores igual a: " + soma);
        System.out.println("=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-");

    }
}
