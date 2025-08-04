package pedro.ProjetoJava.javacore.Jmodificadorfinal.dominio;

public class ContaBancaria {
    public final int numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    @Override
    public String toString() {
        return "Conta: " + this.numeroConta + "\nTitular: " + this.titular + "\nSaldo: " + this.saldo;
    }

    public double depositar(double valor) {
        return this.saldo += valor;
    }

    public double sacar(double valor) {
        return this.saldo -= valor;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
