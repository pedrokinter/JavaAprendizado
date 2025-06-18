package pedro.projetojava.javacore.Eblocosdeinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    // ordem do que acontece dentro da classe do objeto.
    // 1 - espaço em memoria
    // 2 - atributos criados e inicializados com default ou valor passado
    // 3 - bloco de inicializaçao
    // 4 - construtores

    {
        System.out.println("bloco de inicializaçao iniciado");
        // muito usado pra n replicar codigo, como por exemplo um for pra episodios de anime
        // pois sempre vai inicializar antes dos construtores, logo n importa oq acontecer ele vai inicializar primeiro
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        episodios = new int[10];
        System.out.println(episodios.length);
    }
}
