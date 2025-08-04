package pedro.ProjetoJava.javacore.Csobrecargamétodos.dominioAulas2;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    public Anime() {

    }

    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void init(String nome, String tipo, int episodios, String genero) {
        this.init(nome, tipo, episodios);
        // puxa do primeiro init
        this.genero = genero;

        // to sobrecarregando o metodo, porem so posso passar nova quantidade de parametro ou tipo novo de parametro
        // n posso passar a mesma quantidade. porem mesmo tipo sim.
    }

    public void imprime() {
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.nome);
        System.out.println(this.genero);
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return this.episodios;
    }
}
