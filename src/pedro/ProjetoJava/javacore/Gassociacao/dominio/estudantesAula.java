package pedro.projetojava.javacore.Gassociacao.dominio;

public class estudantesAula {
    private String nome;
    private int idade;
    private seminarioAula seminario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public seminarioAula getSeminario() {
        return seminario;
    }

    public void setSeminario(seminarioAula seminario) {
        this.seminario = seminario;
    }
}
