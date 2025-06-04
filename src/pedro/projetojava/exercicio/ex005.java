package pedro.projetojava.exercicio;

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iremos escolher três números para vermos se forma um triângulo válido.");
        System.out.println("Primeiro número: ");
        int n1 = scanner.nextInt();
        System.out.println("Segundo número: ");
        int n2 = scanner.nextInt();
        System.out.println("Terceiro número: ");
        int n3 = scanner.nextInt();
        int soma1 = n1 + n2;
        int soma2 = n2 + n3;
        int soma3 = n3 + n1;
        scanner.close();
        if(soma1 > n3 && soma2 > n1 && soma3 > n2){
            System.out.println("O triangulo é Válido");
        }else{
            System.out.println("O triângulo não é Válido");
        }

    }
}
