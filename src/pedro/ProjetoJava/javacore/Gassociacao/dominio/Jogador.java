package pedro.ProjetoJava.javacore.Gassociacao.dominio;

public class Jogador {
    private String nome;
    private Time time;

    public void imprime() {
        System.out.println("Nome: " + nome);
        if (time != null) {
            System.out.println("Time: " + time.getNome()); // tem que ir dentro do objeto pra pegar o nome
        }

    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
