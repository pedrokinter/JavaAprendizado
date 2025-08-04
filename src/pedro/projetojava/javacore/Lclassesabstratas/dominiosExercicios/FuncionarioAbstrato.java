package pedro.ProjetoJava.javacore.Lclassesabstratas.dominiosExercicios;

public  abstract class FuncionarioAbstrato {
    protected String nome;
    protected double salarioBase;

    public FuncionarioAbstrato(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calculaSalario();

    public void mostrarDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario final: " + calculaSalario());
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
