package pedro.ProjetoJava.exercicio;

import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua nota abaixo: ");
        int nota = scanner.nextInt();
        scanner.close();
        if(nota >= 90 && nota == 100){
            System.out.println("Você tirou A");
        }else if(nota >= 80 && nota <= 89){
            System.out.println("Você tirou B");
        }else if(nota >= 70 && nota <= 79){
            System.out.println("Você tirou C");
        }else if(nota >= 60 && nota <= 69){
            System.out.println("Você tirou D");
        }else if(nota < 60 && nota > 0){
            System.out.println("Você tirou F;");
        }else{
            System.out.println("NOTA INVÁLIDA.");
        }
    }
}

