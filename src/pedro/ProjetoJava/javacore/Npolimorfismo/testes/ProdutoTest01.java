package pedro.ProjetoJava.javacore.Npolimorfismo.testes;

import pedro.ProjetoJava.javacore.Npolimorfismo.dominios.Computador;
import pedro.ProjetoJava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("pc do pedro", 4500);

        CalculadoraImposto.calcularImpostoComputador(computador);
    }
}
