package pedro.projetojava.javacore.Bintroduçaometodos.EXERCICIOS;

import pedro.projetojava.javacore.Bintroduçaometodos.dominioExercicios.Carro014;

import java.util.Scanner;

public class Ex014 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Carro014 carro = new Carro014();

        System.out.println("Digite a marca do seu carro: ");
        carro.marca = entrada.next();

        System.out.println("Digite quanto o seu carro consome (KM/LITRO) : ");
        carro.consumo = entrada.nextDouble();

        System.out.println("Sua viagem terá quantos KM? (DISTANCIA): ");
        carro.dirigir(entrada.nextDouble()); // pra entender os metodos, tenho que acessar a outra classe que faz referencia
        // de objeto

        System.out.println("Agora, abasteça o tanque do seu carro (LITROS) e vamos viajar!: ");
        carro.abastecer(entrada.nextDouble());

        System.out.println("-----------------------");
        carro.sobra();
    }
}
