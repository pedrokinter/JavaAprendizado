package pedro.projetojava.exercicio;

import java.util.Scanner;

public class ex038 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int [] numeros = new int[15];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = ler.nextInt();
        }


        for (int i = 0; i < numeros.length; i++) {
            int contador = 0;
            boolean Par = false;

            for (int j = 0; j < i; j++) {
                if (numeros[i] == numeros[j] && numeros[j] % 2 == 1) {
                    Par = true;
                    break;
                }
            }

            if(!Par){
                //boolean teste = numeros[i] % 2 == 1;
                for (int j = 0; j < numeros.length; j++) {
                    if (numeros[i] == numeros[j] && numeros[j] % 2 == 1) {
                        contador++;
                    }
                }
            }

            System.out.println(numeros[i] + " apareceu " + contador + " vezes");

        }

        //numeros[i] == numeros[j] && numeros[j] % 2 == 1
    }
}
