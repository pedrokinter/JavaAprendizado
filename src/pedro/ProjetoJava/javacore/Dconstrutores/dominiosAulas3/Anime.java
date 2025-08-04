package pedro.ProjetoJava.javacore.Dconstrutores.dominiosAulas3;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    public Anime(String nome, String tipo, int episodios, String genero) {
        this(); // construtor sem argumentos, ele ta sendo chamado.
        this.nome = nome; // no momento da criaçao do objeto, estamos pasasndo um nome
        // logo, o objeto nao pode ser criado sem o argumento do nome
        // é sempre inicializado primeiro q os métodos
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int episodios, String genero, String estudio) {
        this(nome, tipo, episodios, genero); // o java vai achar o construtor baseado no tipo e quantidade de parametros
        // esse daqui vai ser o primeiro construtor iniciazado, pois o objeto ta passando todos os parametros
        // mas ele vai iniciar e ja ir pro construtor de cima, por causa do this
        // e o construtor de cima ja vai vir pro de baixo, tambem por causa do this kkkkkkkkkkkk
        // ai ele vai printar o de baixo
        // voltar pro de cima, ler as linhas dos this e depois o construtor atual (q eu to escrevendo)

        this.estudio = estudio;
    }

    public Anime() {
        System.out.println("construtor sem argumentos");
        //sobrecarga de construtores
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
        System.out.println(this.estudio);
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
