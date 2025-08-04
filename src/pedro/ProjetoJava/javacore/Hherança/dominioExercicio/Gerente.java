package pedro.ProjetoJava.javacore.Hherança.dominioExercicio;

public class Gerente extends funcionarioSuper {
    private String setor;
    //private String nome; // <----- nao precisa, pois ja tem no construtor pro super
    //private int idade;

    public Gerente(String nome, double salario, String setor) {
        super(nome, salario);
        this.setor = setor;
    }
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Setor: " + setor);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
