package pedro.projetojava.javacore.Bintroduçaometodos.dominioExercicios;

public class ContaBancaria016 {
    private String numeroConta;
    private String titular;
    private double saldo;

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setTitular(String titular ) {
        this.titular = titular;
    }

    public double depositar(double valor) {
        return this.saldo += valor;
    }

    public double sacar(double valor) {
        if (this.saldo < 0) {
            System.out.println("SALDO INSUFICIENTE PARA O SAQUE");
            return 0;
        } else {
            return this.saldo -= valor;
        }
    }

    public String getNumeroConta() {
        return this.numeroConta;
    }

    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

}
