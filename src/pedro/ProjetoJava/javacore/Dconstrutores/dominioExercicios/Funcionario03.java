package pedro.ProjetoJava.javacore.Dconstrutores.dominioExercicios;

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
        if (salarioBase < 0) {
            System.out.println("Erro: salario base invalido. ");
        } else {
            this.salarioBase = salarioBase;
        }
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
        System.out.println("Salario total (sem bonus, sem desconto): " + calcularSalario());
    }
}
