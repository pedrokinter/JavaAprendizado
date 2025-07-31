package pedro.projetojava.javacore.Lclassesabstratas.exercicios;

import pedro.projetojava.javacore.Lclassesabstratas.dominiosExercicios.CirculoForma;
import pedro.projetojava.javacore.Lclassesabstratas.dominiosExercicios.RetanguloForma;

import java.util.Scanner;

public class formaTeste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Olá, digite a largura e altura de um retangulo: ");
        int largura = ler.nextInt();
        int altura = ler.nextInt();

        RetanguloForma retangulo = new RetanguloForma(largura,altura);
        CirculoForma circulo = new CirculoForma();

        System.out.println("ok, vamos calcular sua area e seu perimetro");
        System.out.println("Área do retangulo: " +retangulo.calcularArea());
        System.out.println("Perimetro do retangulo: " +retangulo.calcularPerimetro());
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Agora digite o raio de um circulo: ");
        int raio = ler.nextInt();
        circulo.setRaio(raio);
        System.out.println("Área do circulo: " +circulo.calcularArea());
        System.out.println("Perimetro do circulo: " +circulo.calcularPerimetro());

    }
}
