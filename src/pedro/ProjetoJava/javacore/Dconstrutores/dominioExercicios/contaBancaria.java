package pedro.ProjetoJava.javacore.Dconstrutores.dominioExercicios;

public class contaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;
    private double limiteSaque;

    {
        System.out.println("Conta criada com sucesso!");
    }

    public contaBancaria (String titular, String numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (valor > limiteSaque + this.saldo) {
            System.out.println("Saque impossibilitado, passa do limite autorizado!");
        } else if (this.saldo <= 0){
            System.out.println("Saldo insuficiente para saque!");
        } else if (valor < 0){
            System.out.println("Proibido saque negativo");
        } else {
            this.saldo -= valor;
        }
    }

    public void sacar(double valor, double taxa){
        if (valor > limiteSaque + this.saldo) {
            System.out.println("Saque impossibilitado, passa do limite autorizado!");
        } else if (this.saldo <= 0){
            System.out.println("Saldo insuficiente para saque!");
        } else if (taxa < 0 || valor < 0){
            System.out.println("Proibido saque negativo!");
        } else {
            this.saldo -= valor;
            this.saldo -= taxa;
        }
    }

    public void depositar(double valor) {
        if (valor < 0){
            System.out.println("Proibido valores negativos para depósito!");
        } else {
            this.saldo += valor;
        }
    }



    public void exibirDados() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Titular: " + this.titular);
        System.out.println("Numero da Conta: " + this.numeroConta);
        System.out.println("Saldo: R$" + this.saldo);
        System.out.println("Limite Saque: R$" + this.limiteSaque);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    public String getTitular() {
        return titular;
    }


    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }


    public double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }
}
