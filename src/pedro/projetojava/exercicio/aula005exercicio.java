package pedro.ProjetoJava.exercicio;

import java.util.Scanner;

public class aula005exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu salário a seguir: ");
        double salario = scanner.nextDouble();

        if(salario > 0 || salario <= 34.712){
            System.out.println("A taxa que você irá pagar é igual a: R$"+salario*0.097);
        }else if(salario >= 34.713 && salario <= 68.507){
            System.out.println("A taxa que você irá pagar é igual a: R$"+salario*0.3735);
        }else{
            System.out.println("A taxa que você irá pagar é igual a: R$"+salario*0.495);
        }
        // usar menos print e mais variavel printando apenas a variavel
    }
}
