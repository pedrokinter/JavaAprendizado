package pedro.projetojava.javacore.Bintroduçaometodos.testesAulas;

import pedro.projetojava.javacore.Bintroduçaometodos.dominiosAulas.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("=-=-=-=-=-=-=-=-=-= ");
        System.out.println(num1);
        System.out.println(num2);
    }
}
