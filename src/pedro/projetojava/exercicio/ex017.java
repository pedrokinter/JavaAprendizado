package pedro.projetojava.exercicio;

import java.util.Scanner;

public class ex017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite um intervalo inicial");
        int inc = scanner.nextInt();
        System.out.println("Digite um intervalo final");
        int fim = scanner.nextInt();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
        for (int i = inc; i <= fim; i++){
            int mult = n1 * i;
            System.out.println(+n1+ " x " +i+ " = " +mult);

        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
    }
}
