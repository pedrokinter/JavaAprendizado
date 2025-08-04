package pedro.ProjetoJava.javacore.Npolimorfismo.servico;

import pedro.ProjetoJava.javacore.Npolimorfismo.dominios.Computador;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador) {
        System.out.println("Relatorio de imposto do Computador: ");
        double imposto = computador.calcularImposto();
        System.out.println("Imposto do PC" + imposto);
        System.out.println("Nome do PC: " + computador.getNome());
        System.out.println("Valor do PC: " + computador.getValor());

    }

}
