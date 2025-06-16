package pedro.projetojava.javacore.Csobrecargamétodos.testAulas;

import pedro.projetojava.javacore.Csobrecargamétodos.dominioAulas2.Anime;

public class animeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Jojo", "Tv", 160);
        anime.init("Jojo", "Tv", 160, "Açao");

        //anime.setNome("Jojo");
        //anime.setTipo("TV");
        //anime.setEpisodios(12);

        anime.imprime();
    }
}
