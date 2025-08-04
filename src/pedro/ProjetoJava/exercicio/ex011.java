package pedro.projetojava.exercicio;

import java.util.Scanner;

public class ex011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a seguir, digite um número para somarmos de 1 até o respectivo número: ");
        int n = scanner.nextInt();
        int cont = 0;
        int soma = 0;
        while (cont <= n){
            cont += 1;
            soma += cont;
            if(cont == n){
                System.out.println("A soma dos " +n+ " primeiros números é igual a " +soma);
            }else{
                continue;
            }

        }
    }
}
