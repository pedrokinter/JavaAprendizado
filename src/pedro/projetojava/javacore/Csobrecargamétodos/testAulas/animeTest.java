package pedro.projetojava.javacore.Csobrecargamétodos.testAulas;

import pedro.projetojava.javacore.Csobrecargamétodos.dominioAulas2.Anime;

public class animeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.setTipo("TV");
        anime.setEpisodios(12);
        anime.imprime();
    }
}
