package pedro.ProjetoJava.javacore.Bintroduçaometodos.testesPessoais;

import pedro.ProjetoJava.javacore.Bintroduçaometodos.dominiosTestesPessoais.RetanguloRefeito;

import java.util.Scanner;

public class RetanguloTest {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        RetanguloRefeito r1 = new RetanguloRefeito();
        RetanguloRefeito r2 = new RetanguloRefeito();

        r1.altura = entrada.nextDouble();
        r1.largura = entrada.nextDouble();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=");

        r2.altura = entrada.nextDouble();
        r2.largura = entrada.nextDouble();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=");

        r1.area();
        r2.area();
        System.out.println("---------------------");
        if (r1.mArea(r2)){
            System.out.println("area 1 > area 2");
        } else {
            System.out.println("area 2 > area 1");
        }

    }
}
