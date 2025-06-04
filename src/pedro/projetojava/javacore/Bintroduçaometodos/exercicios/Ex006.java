package pedro.projetojava.javacore.Bintroduçaometodos.exercicios;

import pedro.projetojava.javacore.Bintroduçaometodos.dominioExercicios.Moeda006;

import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Moeda006 moeda = new Moeda006();

        System.out.println("Digite o valor em doláres que você quer converter abaixo: ");
        moeda.valorEmDolar = entrada.nextDouble();

        System.out.println("Agora, digite a cotação atual do dolár: ");
        moeda.cotacaoDoDia = entrada.nextFloat();

        System.out.println("O valor do dolár digitado é igual a: $" + moeda.valorEmDolar);
        System.out.println("A cotação atual é igual a: R$" + moeda.cotacaoDoDia);
        System.out.println("O valor convertido em reais é igual a: R$" + moeda.valorEmReais());

        entrada.close();
    }
}
