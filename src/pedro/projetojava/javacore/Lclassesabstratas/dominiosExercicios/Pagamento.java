package pedro.projetojava.javacore.Lclassesabstratas.dominiosExercicios;

public abstract class Pagamento {
    protected double valor;
    protected double valorAPagar;

    public Pagamento(double valorAPagar) {
        this.valorAPagar = valorAPagar;
    }

    public abstract void realizarPagamento(double valor);




    public void imprimirRecibo(){
        System.out.println("Recibo Gerado!");
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorAPagar() {
        return valorAPagar;
    }

    public void setValorAPagar(double valorAPagar) {
        this.valorAPagar = valorAPagar;
    }
}
