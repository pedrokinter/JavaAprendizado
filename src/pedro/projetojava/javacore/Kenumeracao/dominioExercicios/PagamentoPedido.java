package pedro.projetojava.javacore.Kenumeracao.dominioExercicios;

public class PagamentoPedido extends Pedido {
    public final double valorTotal;


    public PagamentoPedido(String id, String descricao, double valorTotal) {
        super(id, descricao);
        this.valorTotal = valorTotal;
    }

//    public void pagar(double valor) {
//        if(valor == valorTotal) {
//            System.out.println("Pagamento efetuado com sucesso!");
//        } else if (valor > valorTotal || valor < valorTotal) {
//            System.out.println("Erro, tente novamente!");
//        }
//    }
}
