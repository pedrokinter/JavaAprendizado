package pedro.projetojava.exercicio;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Diga a sua idade para classificarmos.");
        int idade = scanner.nextInt();
        boolean idadeCriança = idade > 0 && idade < 13;
        boolean idadeAdolescente = idade >= 13 && idade <= 17;
        boolean idadeAdulto = idade >= 18 && idade <= 59;
        scanner.close();

        if(idadeCriança){
            System.out.println("Você tem " +idade+ " e é classificado como Criança.");
        }else if(idadeAdolescente){
            System.out.println("Você tem " +idade+ " e é classificado como Adolescente." );
        }else if(idadeAdulto){
            System.out.println("Você tem " +idade+ " e é classificado como Adulto.");
        }else{
            System.out.println("Você tem " +idade+ " e é classificado como Idoso.");
        }
        
    }
}
