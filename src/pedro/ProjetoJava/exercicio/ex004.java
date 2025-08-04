package pedro.ProjetoJava.exercicio;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iremos escolher dois números a seguir para realizar uma operação.");
        System.out.println("Digite o primeiro número: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = scanner.nextInt();
        System.out.println("Fale qual operação você quer realizar. (*, /, %, +, -)");
        String op = scanner.next();
        scanner.close();
        if(op.equals("*")){
            int resultado = n1 * n2;
            System.out.println("O Resultado da Multiplicação de " +n1+ "+" +n2+ " é igual a: " +resultado);

        }else if(op.equals("/")){
            int resultado = n1 / n2;
            System.out.println("O Resultado da Divisão de " +n1+ "+" +n2+ " é igual a: " +resultado);

        }else if(op.equals("%")){
            int resultado = n1 % n2;
            System.out.println("O Resultado do Resto de Divisão de " +n1+ "+" +n2+ " é igual a: " +resultado);

        }else if(op.equals("+")){
            int resultado = n1 + n2;
            System.out.println("O Resultado da Soma de " +n1+ "+" +n2+ " é igual a: " +resultado);

        }else{
            int resultado = n1 - n2;
            System.out.println("O Resultado da Subtração de " +n1+ "+" +n2+ " é igual a: " +resultado);
        } 
    }
}
