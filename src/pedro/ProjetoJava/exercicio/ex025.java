package pedro.projetojava.exercicio;

import java.util.Scanner;

public class ex025 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite 8 valores inteiros: ");
        int valor = 0;
        int [] valores = new int[8];
        for (int i = 0; i < 8; i++) {
            valor = input.nextInt();
            valores[i] = valor;

        }
        System.out.println("=-=-=-===-");
        int inverso = valores.length;
        // aqui ele le o tamanho do array que foi criado em cima, no caso 8;
        System.out.println("A lista de valores invertida é igual a : ");
        for (int i = 0; i < valores.length; i++) {
            inverso -= 1;
            System.out.println(valores[inverso]);
            // e a aqui pro i menor do que 8, ele vai tirar -1 do inverso e printar a posiçao dos valores com base no inverso
            // entao vai ir de 7, 6, 5, 4 etc

        }
        System.out.println("=-=-=-===-");


    }
}
