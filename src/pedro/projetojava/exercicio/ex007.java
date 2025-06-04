package pedro.projetojava.exercicio;

import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iremos pedir duas notas suas abaixo para calcularmos a média: ");
        System.out.println("Primeira nota: ");
        int nota = scanner.nextInt();
        System.out.println("Segunda nota: ");
        int nota2 = scanner.nextInt();
        scanner.close();

        double media = nota+nota2/2;
        if(media > 6){
            System.out.println("Aluno aprovado");
        }else if(media <= 6){
            System.out.println("Aluno reprovado.");
        }
    }
}
