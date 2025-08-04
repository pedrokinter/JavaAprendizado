package pedro.ProjetoJava.javacore.Hherança.dominioExercicio;

public class funcionarioSuper {
    private String nome;
    private double Salario;

    public funcionarioSuper(String nome, double salario) {
        this.nome = nome;
        Salario = salario;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + Salario);
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }
}
