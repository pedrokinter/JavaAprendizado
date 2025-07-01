package pedro.projetojava.javacore.Gassociacao.testeAula;

import pedro.projetojava.javacore.Gassociacao.dominio.Jogador;
import pedro.projetojava.javacore.Gassociacao.dominio.Time;

public class jogadorTest02 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Romarinho");
        Time time = new Time("Selecao brasileira");


        j1.setTime(time);

        j1.imprime();
    }
}
