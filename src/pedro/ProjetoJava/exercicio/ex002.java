package pedro.ProjetoJava.exercicio;

import java.util.Scanner;


public class ex002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int numero2 = scanner.nextInt();
        scanner.close();
        
        if(numero > numero2){
            System.out.println("O número 1: " +numero+ ", é maior que o número 2: " +numero2);
        }else if(numero == numero2){
            System.out.println("O número 1 e o número 2 são iguais.");
        }else{
            System.out.println("O número 2: " +numero2+ " é maior que o número 1: " +numero);
        }
    }
}
