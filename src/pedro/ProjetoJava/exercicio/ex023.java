package pedro.ProjetoJava.exercicio;

import java.util.Scanner;

public class ex023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 10 valores abaixos para serem somados: ");
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            int [] a = new int[10];
            int teste = a[i] = n;
            soma += teste;
            // simples, eu crio um array de 10 posiçoes, armazeno os numeros nessas 10 posiçoes
            // e cada numero ja vai direto pra variavel soma pra ser somado tudo junto.
        }
        System.out.println("A soma dos 10 últimos valores é igual a: " + soma);

    }
}
