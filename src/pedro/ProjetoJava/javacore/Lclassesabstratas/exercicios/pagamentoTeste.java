package pedro.ProjetoJava.javacore.Lclassesabstratas.exercicios;

import pedro.ProjetoJava.javacore.Lclassesabstratas.dominiosExercicios.PagamentoBoleto;
import pedro.ProjetoJava.javacore.Lclassesabstratas.dominiosExercicios.PagamentoCartao;

public class pagamentoTeste {
    public static void main(String[] args) {
        PagamentoCartao cartao = new PagamentoCartao(1000);
        PagamentoBoleto boleto = new PagamentoBoleto(1000);

        System.out.println("Informações do pagamento do cartão: ");
        cartao.realizarPagamento(1000);
        System.out.println(cartao);

        boleto.realizarPagamento(900);

        System.out.println("--------------------------");
        System.out.println("Informações do pagamento do boleto: ");
        boleto.imprimirRecibo();
        System.out.println(boleto);
    }
}
