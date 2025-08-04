package pedro.ProjetoJava.javacore.Bintroduçaometodos.EXERCICIOS;

import pedro.ProjetoJava.javacore.Bintroduçaometodos.dominioExercicios.Temperatura012;

import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Temperatura012 celsius = new Temperatura012();
        Temperatura012 fahrenheit = new Temperatura012();
        Temperatura012 kelvin = new Temperatura012();

        System.out.println("Digite a sua temperatura em celsius: ");
        celsius.temperatura = ler.nextDouble();
        System.out.println(celsius.celsiusParaFahrenheit());
        System.out.println(celsius.celsiusParaKelvin());

        System.out.println("-------------------------------------");

        System.out.println("Digite a sua temperatura em  fahrenheit: ");
        fahrenheit.temperatura = ler.nextDouble();
        System.out.println(fahrenheit.fahrenheitParaCelsius());





    }
}
