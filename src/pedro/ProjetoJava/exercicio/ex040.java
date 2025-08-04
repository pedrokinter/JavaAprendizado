package pedro.ProjetoJava.exercicio;

import java.util.Scanner;

public class ex040 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetor = new int[10];
        System.out.println("Digite 10 números abaixo: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = ler.nextInt();
        }
        System.out.println("-=-=-=-=-=-=-=-=");
        int[] vetorNovo = new int[3];
        System.out.println("Digite 3 números para serem lidos e dito se aparecem na matriz ou não: ");
        for (int i = 0; i < vetorNovo.length; i++) {
            vetorNovo[i] = ler.nextInt();
        }
        System.out.println("=-=-=-=-=-=-=");
        for (int i = 0; i < vetorNovo.length; i++) {
            int contador = 0;
            boolean jaContou = false;
            // aq começa falso a parada

            for (int j = 0; j < i; j++) {
                if (vetorNovo[i] == vetor[j]) {
                    jaContou = true;
                    // se ja tiver aparecido o numero, ai ele quebra o loop e volta pro for desde o começo
                    break;
                }
            }

            if (!jaContou) {
                // se nao tiver aparecido, ele faz um novo loop e sai contando qnts vezes o numero apareceu
                for (int j = 0; j < vetor.length; j++) {
                    if (vetorNovo[i] == vetor[j]) {
                        contador++;
                    }
                }
            }
            // ai é tudo impresso nessa saida
            System.out.println(vetorNovo[i] + " apareceu " + contador + " vezes");

        }
    }
}
