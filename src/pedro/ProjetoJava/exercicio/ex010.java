package pedro.ProjetoJava.exercicio;

import java.util.Scanner;

public class ex010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos pedir 3 números a seguir e comparar qual o maior deles");
        System.out.println("Primeiro número");
        int n1 = scanner.nextInt();
        System.out.println("Segundo número");
        int n2 = scanner.nextInt();
        System.out.println("Terceiro número");
        int n3 = scanner.nextInt();
        scanner.close();
        if(n1 > n2 && n1 > n3){
            System.out.println("O Primeiro número " +n1+ " é o maior número entre " +n2+ " , " +n3);
        }else if(n2 > n1 && n2 > n3){
            System.out.println("O Segundo número " +n2+ " é o maior número entre " +n1+ " , " +n3);
        }else{
            System.out.println("O Terceiro número " +n3+ " é o maior número entre " +n1+ " , " +n2);
        }
    }
}
