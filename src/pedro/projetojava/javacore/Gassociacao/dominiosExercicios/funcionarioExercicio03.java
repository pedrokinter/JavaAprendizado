package pedro.projetojava.javacore.Gassociacao.dominiosExercicios;

public class funcionarioExercicio03 {
    private String nome;
    private double salario;
    private departamentoExercicio03 departamento;


    public funcionarioExercicio03(String nome, double salario) {

        this.salario = salario;
        this.nome = nome;
    }

    public void exibirFuncionario() {

        System.out.println(this.nome + " ");
        System.out.println("Salário: R$" + this.salario + " ");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public departamentoExercicio03 getDepartamento() {
        return departamento;
    }

    public void setDepartamento(departamentoExercicio03 departamento) {
        this.departamento = departamento;
    }
}
