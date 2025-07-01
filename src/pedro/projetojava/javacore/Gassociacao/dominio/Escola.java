package pedro.projetojava.javacore.Gassociacao.dominio;

public class Escola {
    private String nome;
    private Professor [] professores;

    public Escola(String nome) {
        this.nome = nome;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        if(this.professores != null) {
            for (Professor professor : this.professores) {
                System.out.println("Professor: " + professor.getNome());

            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
