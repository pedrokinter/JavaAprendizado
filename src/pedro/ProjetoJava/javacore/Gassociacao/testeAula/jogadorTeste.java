package pedro.ProjetoJava.javacore.Gassociacao.testeAula;

import pedro.ProjetoJava.javacore.Gassociacao.dominio.Jogador;

public class jogadorTeste {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("messi");
        Jogador jogador2 = new Jogador("cr7");
        Jogador jogador3 = new Jogador("neymar");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }

    }
}
