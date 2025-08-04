package pedro.ProjetoJava.javacore.Bintroduçaometodos.testesPessoais;

import pedro.ProjetoJava.javacore.Bintroduçaometodos.dominiosTestesPessoais.Calculadora;

import java.util.Scanner;

public class CalculadoraTest {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("CALCULADORA ABAIXO, DIGITE 2 NUMEROS: ");
        calculadora.a = entrada.nextDouble();
        calculadora.b = entrada.nextDouble();

        System.out.println("Você quer somar, subtrair, multiplicar ou dividir esses números?: ");
        String pergunta = entrada.next().toLowerCase();

        switch (pergunta) {
            case "somar":
                calculadora.somar(calculadora.a, calculadora.b);
                System.out.println("A soma desses dois números é igual a: " +calculadora.getResultado());
                break;
            case "subtrair":
                calculadora.subtrair(calculadora.a, calculadora.b);
                System.out.println("A subtração desses dois números é igual a: " +calculadora.getResultado());
                break;
            case "multiplicar":
                calculadora.multiplicar(calculadora.a, calculadora.b);
                System.out.println("A multiplicação desses dois números é igual a: " +calculadora.getResultado());
                break;
            case "dividir":
                calculadora.dividir(calculadora.a, calculadora.b);
                if (calculadora.a == 0 || calculadora.b == 0){
                    System.out.println("NÃO É POSSIVEL DIVIDIR POR ZERO");
                } else {
                    System.out.println("A divisão desses dois números é igual a: " + calculadora.getResultado());
                    break;
                }
        }

    }
}
