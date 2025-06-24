package pedro.projetojava.javacore.Dconstrutores.dominioExercicios;

public class funcionarioEstatico06 {
        private String nome;
        private String cargo;
        private double salario;
        private static int totalFuncionarios;


    public void incrementoFuncionarios() {
        funcionarioEstatico06.totalFuncionarios++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getTotalFuncionarios() {
        return funcionarioEstatico06.totalFuncionarios;
    }

    public static void setTotalFuncionarios(int totalFuncionarios) {
        funcionarioEstatico06.totalFuncionarios = totalFuncionarios;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Salario: " + this.salario);
        System.out.println("Total de funcionarios atuais: " + funcionarioEstatico06.totalFuncionarios);
    }
}
