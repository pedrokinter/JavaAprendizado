package pedro.ProjetoJava.javacore.Bintroduçaometodos.dominioExercicios;

public class Jogador017 {
    private String nome;
    private int idade;
    private int golsMarcados;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void marcarGol(int gols) {
        golsMarcados += gols;
    }

    public int getGolsMarcados() {
        return golsMarcados;
    }


}
