package pedro.ProjetoJava.exercicio;

import java.util.Scanner;

public class ex015 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Quantos números você vai digitar? ");
        int n = ler.nextInt();
        int cont = 0;
        int pares = 0;
        int impares = 0;
        System.out.println("======================");
        while(cont < n){
            cont += 1;
            System.out.println("Digite o número " +cont+ ": " );

            int n1 = ler.nextInt();
            if(n1 % 2 == 0){
                pares += 1;
            }else{
                impares += 1;
            }

        }
        System.out.println("======================");
        System.out.println("Quantidade de número pares: " +pares);
        System.out.println("Quantidade de número impares: " +impares);
    }
}
