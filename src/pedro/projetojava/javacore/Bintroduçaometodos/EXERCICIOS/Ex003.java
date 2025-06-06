package pedro.projetojava.javacore.Bintroduçaometodos.EXERCICIOS;

import pedro.projetojava.javacore.Bintroduçaometodos.dominioExercicios.eRetangulo003;

import java.util.Objects;
import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner ler =  new Scanner(System.in);
        eRetangulo003 retangulo = new eRetangulo003();
        System.out.println("A seguir, digite a base e a altura de um retângulo para retornar a área dele: ");
        retangulo.base = ler.nextDouble();
        System.out.println("=-=-=-=-=");
        retangulo.altura = ler.nextDouble();
        System.out.println("=-=-=-=-=");
        System.out.println("Agora, digite se os valores estão em MM, CM ou M");

        retangulo.medida = ler.next().toLowerCase();
        if (Objects.equals(retangulo.medida, "mm") || Objects.equals(retangulo.medida, "cm") || Objects.equals(retangulo.medida, "m")) {
            System.out.println("=-==-=-=-=-=-=-=-=");
            System.out.println("O Valor da base é igual a: " + retangulo.base + retangulo.medida);
            System.out.println("O Valor da altura é igual a: " + retangulo.altura + retangulo.medida);
            System.out.println("O Valor final da área é igual a: " + retangulo.retornarAreaRetangulo() + retangulo.medida);
        } else {
            System.out.println("Medidas erradas, tente novamente.");
        }


    }
}
