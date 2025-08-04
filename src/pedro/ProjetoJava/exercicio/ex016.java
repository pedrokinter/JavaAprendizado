package pedro.ProjetoJava.exercicio;

import java.util.Scanner;

public class ex016 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        int n1 = numeros.nextInt();
        int n2 = numeros.nextInt();
        int soma = 0;
        System.out.println("================");
        numeros.close();
        for(int i = 1; i <= n2; i++){
            soma += n1;
            System.out.println(+n1+ " x " +i+ " = " +soma);
        }   
        System.out.println("================");
    }
}
