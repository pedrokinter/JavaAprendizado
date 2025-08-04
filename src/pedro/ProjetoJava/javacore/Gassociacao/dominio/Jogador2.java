package pedro.ProjetoJava.javacore.Gassociacao.dominio;

public class Jogador2 {
    private String nome;
    private Time2 time; //referencia para a classe time2

    public void imprime() {
        System.out.println("Nome: " + nome);

        System.out.println("Time: " + time.getNome());
    }


    public Jogador2(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time2 getTime() {
        return time;
    }

    public void setTime(Time2 time) {
        this.time = time;
    }
}
