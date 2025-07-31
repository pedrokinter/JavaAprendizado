package pedro.projetojava.javacore.Lclassesabstratas.dominiosExercicios;

public class PagamentoCartao extends Pagamento {
    public PagamentoCartao(double valorAPagar) {
        super(valorAPagar);
    }

    public void realizarPagamento(double valor) {
        valorAPagar -= valor;
    }

    @Override
    public String toString() {
        return "PagamentoCartao{" +
                "valorAPagar=" + valorAPagar +
                '}';
    }
}
