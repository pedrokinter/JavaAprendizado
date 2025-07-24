package pedro.projetojava.javacore.Hherança.dominioExercicio;

public class professorExercicio extends pessoaExercicio {
    private double salario;


    public professorExercicio(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Salario: " + this.salario);
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
