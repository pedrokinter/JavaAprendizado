package pedro.projetojava.javacore.Bintroduçaometodos.exercicios;

import pedro.projetojava.javacore.Bintroduçaometodos.dominioExercicios.Carro005;

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Carro005 carro = new Carro005();

        System.out.println("Digite o nome do carro: ");
        carro.modelo = ler.next();

        System.out.println("Digite quanto o carro consome (km/litro): ");
        carro.consumo = ler.nextInt();

        System.out.println("E agora digite a distância do local em que quer ir (km) : ");
        carro.distancia = ler.nextInt();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.println("O modelo do carro é: " + carro.modelo);
        System.out.println("E ele irá gastar de Litros de gasolina para a viagem o equivalente a: " +carro.litrosGastos()+ "L");
        System.out.println("Possuindo um consumo igual: " +carro.consumo+ "Km/litro");
    }
}
