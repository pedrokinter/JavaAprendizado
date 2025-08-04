package pedro.ProjetoJava.exercicio;

import java.util.Scanner;

public class ex018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número abaixo para dizermos se é primo: ");
        int n1 = scanner.nextInt();
        System.out.println("=-==-=-=--=-=-=-=-=---=-=-=-=-=");

        if(n1 / n1 == 1 && n1 / 1 == n1 && n1 % 2 == 0 || n1 % 3 == 0){
            System.out.println("o Número " +n1+ " Não é um número primo");
        }else{
            System.out.println("O Número " +n1+ " é um número primo");
        }
        System.out.println("=-==-=-=--=-=-=-=-=---=-=-=-=-=");
    }
}

// n1 / n1 == 1 && n1 / 1 == n1 && n1 / 2 != n1 && n1 / 2 != 1