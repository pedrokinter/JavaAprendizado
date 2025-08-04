package pedro.projetojava.javacore.Gassociacao.dominio;

public class professoresAula {
    private String nome;
    private String especialidade;
    private seminarioAula seminarios;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public seminarioAula getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(seminarioAula seminarios) {
        this.seminarios = seminarios;
    }
}
