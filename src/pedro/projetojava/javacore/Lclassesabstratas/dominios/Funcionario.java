package pedro.projetojava.javacore.Lclassesabstratas.dominios;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularBonus();
    }

    public abstract void calcularBonus();
    // forçar a todas as subclasses a prover uma implementaçao para ESSE metodo
    // esse metodo vai ter que ser colocado em toda as sub classes de funcionario


}
