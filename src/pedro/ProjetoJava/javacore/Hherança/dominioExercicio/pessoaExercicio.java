package pedro.projetojava.javacore.Hherança.dominioExercicio;

public class pessoaExercicio {
    private String nome;
    private String cpf;

    public pessoaExercicio(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
