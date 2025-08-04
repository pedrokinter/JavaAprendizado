package pedro.ProjetoJava.javacore.Lclassesabstratas.dominiosExercicios;

public class PagamentoCartao extends Pagamento {
    public PagamentoCartao(double valorAPagar) {
        super(valorAPagar);
    }

    public void realizarPagamento(double valor) {
        if (valor <= 0){
            System.out.println("Valor invalido");
            return;
        }
        if (valor > valorAPagar){
            System.out.println("Pagamento maior que o valor devido. Ajustando para valor devido");
            valor = valorAPagar;
        }
        this.valor = valor;
        valorAPagar -= valor;
    }

    @Override
    public String toString() {
        return "PagamentoCartao{" +
                "valorAPagar=" + valorAPagar +
                '}';
    }
}
