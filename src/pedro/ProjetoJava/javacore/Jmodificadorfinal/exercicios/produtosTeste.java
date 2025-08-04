package pedro.projetojava.javacore.Jmodificadorfinal.exercicios;

import pedro.projetojava.javacore.Jmodificadorfinal.dominio.ProdutoExercicio;
import pedro.projetojava.javacore.Jmodificadorfinal.dominio.ProdutoPerecivelExercicio;

public class produtosTeste {
    public static void main(String[] args) {
        ProdutoExercicio produto = new ProdutoExercicio("Leite Jussara", 5.04);
        ProdutoPerecivelExercicio produtoPerecivel = new ProdutoPerecivelExercicio("Maça", 0.90, "01/08/25");

        System.out.println(produto);
        System.out.println(produtoPerecivel);
    }
}
