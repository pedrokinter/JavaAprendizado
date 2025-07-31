package pedro.projetojava.javacore.Lclassesabstratas.dominiosExercicios;

public class PagamentoBoleto extends Pagamento {
    public PagamentoBoleto(double valorAPagar) {
        super(valorAPagar);
    }

    public void realizarPagamento(double valor) {
        valorAPagar -= valor;
    }

    @Override
    public void imprimirRecibo() {
        super.imprimirRecibo();
    }

    @Override
    public String toString() {
        return "PagamentoBoleto{" +
                "valor=" + valor +
                ", valorAPagar=" + valorAPagar +
                '}';
    }
}
