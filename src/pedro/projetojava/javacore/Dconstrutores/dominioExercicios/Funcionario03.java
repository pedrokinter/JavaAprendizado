package pedro.projetojava.javacore.Dconstrutores.dominioExercicios;

public class Funcionario03 {
    private String nome;
    private String cargo;
    private double salarioBase;

    {
        System.out.println("Novo funcionário registrado!");
    }

    public Funcionario03(String nome, String cargo, double salarioBase) {
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public double calcularSalario(double bonus) {
        return salarioBase + bonus;
    }

    public double calcularSalario(double bonus, double desconto){
        return salarioBase + bonus - desconto;
    }

    public void imprimirFuncionario() {
        System.out.println("--------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario total (sem bonus, porem com desconto): " + calcularSalario());
    }
}
