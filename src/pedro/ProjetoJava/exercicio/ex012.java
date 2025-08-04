package pedro.ProjetoJava.exercicio;

import java.util.Scanner;

public class ex012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A seguir, digite um número para imprimirmos a tabuada dele: ");
        int n = scanner.nextInt();
        int cont = 0;
        System.out.println("-======================-");
        while (cont < 10){
            cont += 1;
            int tabuada = n * cont;

            System.out.println(+n+ " x " +cont+ " = " +tabuada);
        }
        System.out.println("-======================-");

    }
}
