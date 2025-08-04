package pedro.projetojava.javacore.Bintroduçaometodos.EXERCICIOS;

import pedro.projetojava.javacore.Bintroduçaometodos.dominioExercicios.Retangulo011;

import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Retangulo011 retangulo1 = new Retangulo011();
        Retangulo011 retangulo2 = new Retangulo011();

        retangulo1.altura = entrada.nextDouble();
        retangulo1.largura = entrada.nextDouble();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=");

        retangulo2.altura = entrada.nextDouble();
        retangulo2.largura = entrada.nextDouble();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=");


        System.out.println(retangulo1.area(retangulo1));
        System.out.println(retangulo2.area(retangulo2));
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("O perimetro do primeiro retângulo é igual a: " +retangulo1.perimetro(retangulo1));
        System.out.println("O perimetro do  segundo retângulo é igual a: " +retangulo2.perimetro(retangulo2));
        System.out.println("--------------------------");
        System.out.println(retangulo1.comparar(retangulo2));

    }
}
