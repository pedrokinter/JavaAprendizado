package pedro.projetojava.javacore.Dconstrutores.EXERCICIOS;

import pedro.projetojava.javacore.Dconstrutores.dominioExercicios.lojaDeTaxa08;

import java.util.Scanner;

public class ex008 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");
        String nome = entrada.nextLine();

        System.out.println("Digite o preço do produto: ");
        double preco = entrada.nextDouble();
        entrada.nextLine();

        lojaDeTaxa08 produto = new lojaDeTaxa08(nome, preco);

        System.out.println("=-=-=-=-=-=-=-=-=-=--=-=-=");
        System.out.println("Digite a taxa de imposto sobre os produtos: ");
        lojaDeTaxa08.getTaxaImposto(entrada.nextDouble());

        produto.calcularPrecoComImposto();

        produto.exibirDados();
    }
}
