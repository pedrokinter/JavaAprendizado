package pedro.projetojava.javacore.Lclassesabstratas.exercicios;

import pedro.projetojava.javacore.Lclassesabstratas.dominiosExercicios.CirculoForma;
import pedro.projetojava.javacore.Lclassesabstratas.dominiosExercicios.Forma;
import pedro.projetojava.javacore.Lclassesabstratas.dominiosExercicios.RetanguloForma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class formaTeste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Olá, digite a largura e altura de um retangulo: ");
        int largura = ler.nextInt();
        int altura = ler.nextInt();

        List<Forma> formas = new ArrayList<Forma>();
        RetanguloForma retangulo = new RetanguloForma(largura,altura);
        CirculoForma circulo = new CirculoForma(100);

        System.out.println("ok, vamos calcular sua area e seu perimetro");
        System.out.println("Área do retangulo: " +retangulo.calcularArea());
        System.out.println("Perimetro do retangulo: " +retangulo.calcularPerimetro());
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Área do circulo: " +circulo.calcularArea());
        System.out.println("Perimetro do circulo: " +circulo.calcularPerimetro());
        System.out.println("-==-=-==========--------=====================-");
        formas.add(retangulo);
        formas.add(circulo);

        for (Forma forma : formas) {
            System.out.println(forma.calcularArea());
            System.out.println(forma.calcularPerimetro());
        }


    }
}
