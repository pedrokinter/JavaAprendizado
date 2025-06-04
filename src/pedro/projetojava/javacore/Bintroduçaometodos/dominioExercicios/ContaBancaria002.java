package pedro.projetojava.javacore.Bintroduçaometodos.dominioExercicios;

public class ContaBancaria002 {
    public String titular;
    public double saldo;
    public double valorDeposito;

    public double calcularSaldoFinal() {
        return saldo + valorDeposito;
    }
}
