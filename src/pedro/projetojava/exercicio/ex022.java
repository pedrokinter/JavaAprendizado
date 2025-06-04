package pedro.projetojava.exercicio;

import java.util.Random;
import java.util.Scanner;

public class ex022 {
    public static void main(String[] args) {
        Scanner perg = new Scanner(System.in);
        Random aleatorio = new Random();

        int valorAleatorio = aleatorio.nextInt(100);

        System.out.println(valorAleatorio);
        System.out.println("=-===-=-==-=-=-=-=");

        System.out.println("Digite um valor para ser adivinhado: ");
        int numeroAdivinhar = perg.nextInt();

        while (numeroAdivinhar != valorAleatorio) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-");
            if(numeroAdivinhar < valorAleatorio) {
                System.out.println("Valor abaixo do gerado, tente um número maior.");
            }else{
                System.out.println("Valor acima do gerado, tente um número menor");
            }
            // nem precisa explicar essa bosta ne, facilmente entendivel
            numeroAdivinhar = perg.nextInt();
            if (numeroAdivinhar == valorAleatorio) {
                System.out.println("Parabens, voce acertou o valor: " +valorAleatorio);
                System.out.println("=-=-=-=-=--");
                break;
            }


        }

    }
}
