package pedro.projetojava.javacore.Gassociacao.dominio;

public class Time2 {
    private String nome;
    private Jogador2[] jogadores; // referencia para a classe jogador2
    private Time2 time;

    public Time2(String nome) {
        this.nome = nome;
    }

    public Time2(String nome, Jogador2[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        if (jogadores == null) return;
        for (Jogador2 jogador: jogadores) {
            System.out.println(jogador.getNome());

        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador2[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador2[] jogadores) {
        this.jogadores = jogadores;
    }

}
