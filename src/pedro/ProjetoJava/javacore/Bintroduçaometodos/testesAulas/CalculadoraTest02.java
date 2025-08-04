package pedro.projetojava.javacore.Bintroduçaometodos.testesAulas;

import pedro.projetojava.javacore.Bintroduçaometodos.dominiosAulas.Calculadora;

import java.util.Scanner;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        calculadora.multiplicaDoisNumeros(10, 20);
        // quando está no dominio, é parametro
        // quando é chamado pelo objeto, é argumento
        // e aqui eu estou multiplicando 10 por 20

        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();

        calculadora.multiplicaDoisNumeros(numero1, numero2);

        // assim como tambem posso criar 2 variaveis e botar o valor que eu quiser e trocar dentro dos argumentos
        // ele ira dar a saida da multiplicação dessas duas variaveis conforme o dominio;
        // só não posso colocar nelas outra coisa q n seja int, pois ai vai dar erro. Tenho q seguir os msm do parametro
    }
}
