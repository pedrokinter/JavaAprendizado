package pedro.projetojava.javacore.Npolimorfismo.testes;

import pedro.projetojava.javacore.Npolimorfismo.dominios.Computador;
import pedro.projetojava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("pc do pedro", 4500);

        CalculadoraImposto.calcularImpostoComputador(computador);
    }
}
