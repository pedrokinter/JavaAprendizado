package pedro.ProjetoJava.javacore.Lclassesabstratas.dominiosExercicios;

public class PagamentoBoleto extends Pagamento {
    public PagamentoBoleto(double valorAPagar) {
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
    public void imprimirRecibo() {
        System.out.println("recibo de pagamento por boleto");
        System.out.println("Valor: " + valor);
        System.out.println("Valor restante: " + valorAPagar);
    }

    @Override
    public String toString() {
        return "PagamentoBoleto{" +
                "valor=" + valor +
                ", valorAPagar=" + valorAPagar +
                '}';
    }
}
