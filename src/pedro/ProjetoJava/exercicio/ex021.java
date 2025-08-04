package pedro.ProjetoJava.exercicio;

import java.util.Scanner;

public class ex021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int n1 = 1; //
        int n2 = 0; //
        System.out.println("=-==-=-=-=-=");
        for(int i = 1; i <= n; i++) {
            int soma = n1 + n2;
            n1 = n2;
            n2 = soma;
            System.out.println(soma);
        }
        // aqui, ele soma o 1 e 0, o n1 vira 0 e o n2 vira a soma
        // entao fica +- assim:
        // n1 + n2 = 1, n1 = 0; n2 = 1;
        // n1 + n2 = 1; n1 = 1; n2 = 1;
        // n1 + n2 = 2; n1 = 1; n2 = 2;
        // etc etc. assim forma a sequencia de fibonnaci perfeitamente
        }
    }   
