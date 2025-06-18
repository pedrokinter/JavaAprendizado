package pedro.projetojava.javacore.Dconstrutores.dominioExercicios;

public class Banco {
    private String titular;
    private double saldo;

    public Banco(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo () {
        return saldo;
    }

    public double depositar(double valor) {
        return this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if (this.saldo > 0 && valor > 0){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public void transferir(Banco destino, double valor) {
        this.sacar(valor);
        destino.depositar(valor);

    }
}
