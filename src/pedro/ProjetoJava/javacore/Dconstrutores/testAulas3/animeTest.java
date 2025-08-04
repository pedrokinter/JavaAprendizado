package pedro.ProjetoJava.javacore.Dconstrutores.testAulas3;


import pedro.ProjetoJava.javacore.Dconstrutores.dominiosAulas3.Anime;

public class animeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Penis", "Tv", 160, "Açao", "sHONEN");
        //Anime anime2 = new Anime();
        //anime2.imprime(); // vai passar tudo nulo, pq ele ta sobrecarregado, logo n precisa passsar os parametros
        anime.imprime();
        //anime.init("Jojo", "Tv", 160);
        //anime.init("Jojo", "Tv", 160, "Açao");

        //anime.setNome("Jojo");
        //anime.setTipo("TV");
        //anime.setEpisodios(12);


    }
}
