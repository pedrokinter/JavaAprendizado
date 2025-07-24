package pedro.projetojava.javacore.Hherança.dominioExercicio;

public class alunoExercicio  extends pessoaExercicio {
    private String matricula;



    public alunoExercicio(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Matricula: " + matricula);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
