package pedro.projetojava.exercicio;

import java.util.Scanner;

public class ex008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Irei pedir dois números a seguir: ");
        System.out.println("Digite o primeiro número: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite o Segundo número: ");
        int n2 = scanner.nextInt();
        boolean positivo = n1 > 0;
        boolean positivo2 = n2 > 0;
        String negativo = "";
        String real = "";
        scanner.close();
        
        if(positivo == true){
            real = "Primeiro número positivo";
        }else{
            negativo = "Primeiro número negativo";
        }
        System.out.println(real+negativo);
        
        if (positivo2 == true){
            System.out.println("Segundo número positivo");
        }else{
            System.out.println("Segundo número negativo");
        }

        if(n1 < 0 && n2 < 0 || n1 > 0 && n2 > 0){
            System.out.println("Ambos os números tem o mesmo sinal");
        }else{
            System.out.println("Os números tem sinais diferentes");
        }

    }
}
