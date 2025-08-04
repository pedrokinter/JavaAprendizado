package pedro.ProjetoJava.javacore.Bintroduçaometodos.EXERCICIOS;

import pedro.ProjetoJava.javacore.Bintroduçaometodos.dominioExercicios.Triangulo007;

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Triangulo007 triangulo = new Triangulo007();

        System.out.println("A seguir, digite 3 lados de um triângulo para falarmos seu tipo (equilátero, isósceles, escaleno): ");

        System.out.println("Lado 1: ");
        triangulo.lado1 = ler.nextInt();
        System.out.println("Lado 2: ");
        triangulo.lado2 = ler.nextInt();
        System.out.println("Lado 3: ");
        triangulo.lado3 = ler.nextInt();

        System.out.println("=-=-=-=-=-==-=-=");

        System.out.println("O triângulo de lados iguais a: ( " + triangulo.lado1 + ", " + triangulo.lado2 + ", " + triangulo.lado3 + " ) ");

        if (triangulo.tipoTriangulo() == "Equilátero") {
            System.out.println("É conhecido como um Triângulo " + triangulo.tipoTriangulo() + " pois possui todos os lados iguais.");
        } else if (triangulo.tipoTriangulo() == "Isósceles") {
            System.out.println("É conhecido como um Triângulo " + triangulo.tipoTriangulo() + " pois possui 2 lados iguais, e 1 diferente,");
        } else if (triangulo.tipoTriangulo() == "Escaleno") {
            System.out.println("É conhecido como um Triângulo " + triangulo.tipoTriangulo() + " pois possui todos os lados diferentes.");
        }

        System.out.println("=-=-=-=-=-=-=-=-");
        ler.close();

    }
}
