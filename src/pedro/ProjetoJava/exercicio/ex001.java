package pedro.projetojava.exercicio;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int teste = scanner.nextInt();
        System.out.println("Você digitou o número: " +teste);
        scanner.close();
        int pAR = teste % 2;

        if(pAR == 0){
            System.out.println("Seu número " +teste+ " é par, pois tem resto de divisão " +pAR);

        }else{
            System.out.println("Seu número " +teste+ " É impar, pois tem resto de divisão " +pAR);
        }


    }
}
