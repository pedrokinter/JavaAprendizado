package pedro.projetojava.exercicio;

import java.util.Arrays;
import java.util.Scanner;

public class ex036 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int [] vetor = new int[10];
        int [] vetor2 = new int[10];

        // vai ler os 10 numeros
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = ler.nextInt();

        }

        // for principal que vai olhar cada número do vetor para contar qnts vezes ele aparece
        for (int i = 0; i < vetor.length; i++) {
            boolean continuar = false;
                // verifica se ja contou o vetor[i] ja apareceu anteriormente
                // com o for indo de 0 até i - 1, olhando os numeros antes da posição atual de vetor[i]
                for (int j = 0; j < i - 1; j++) {
                    if (vetor[i] == vetor[j]) {
                        continuar = true;
                        // ai se ele encontrou algum igual, o continuar fica true e a contagem é pulada, repetindo tudo
                        // do começo.
                        break;
                    }
                }
                // se ele não contou, ele vai continuar
                // ai ele vai fazer o loop pra adicionar +1 no contador
                if (!continuar){
                    int teste = 0;
                    for (int j = 0; j < vetor.length; j++) {
                        // vai verificar se i = j, pra ai adicionar +1 no contador
                        if (vetor[i] == vetor[j]) {
                        teste += 1;

                        }
                    }
                    // e aqui ele vai imprimir o número e as vezes que ele apareceu
                    System.out.println(vetor[i] + " apareceu " + teste + " vezes");
                }

        }

    }
}
