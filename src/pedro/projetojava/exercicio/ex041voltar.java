package pedro.projetojava.exercicio;

import java.util.Arrays;
import java.util.Scanner;

public class ex041voltar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int [10];
        System.out.println("Digite 10 números para serem colocados em uma matriz, e serão dito os que não se repetem: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        int [] naoSeRepete = new int [10];
        System.out.println("=-=-=-=-=-=-=");
        System.out.println("Numeros que não se repetem nessa matriz: ");
        for (int i = 0; i < numeros.length; i++) {
            int contador = 0;
            for (int j = 0; j < numeros.length; j++) {
                // se o numero[i]  for igual ao numero [j], ele adiciona +1 no contador e bota dentro do array novo
                // entao se numero[i] = 1 e numero[j] = 1, ai faz todo o role q eu expliquei
                // mas oq vai importar é só os numeros q foram contados 1 vez;
                if (numeros[i] == numeros[j]) {
                    naoSeRepete[i] = numeros[i];
                    contador++;
                }
            }
            // mas ai ele so vai printar os numeros que apareceram 1 vez (contador == 1)
            // por isso esse if aqui.
            // codigo bem simples, eu n precisava exagerar tanto qnd qu eifz
            if (contador == 1){
                System.out.print(naoSeRepete[i] + " ");
            }
        }
        System.out.println("=-=-=-=-=-=-=");
    }
}

