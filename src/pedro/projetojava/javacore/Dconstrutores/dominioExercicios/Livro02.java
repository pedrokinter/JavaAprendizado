package pedro.projetojava.javacore.Dconstrutores.dominioExercicios;

public class Livro02 {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    {
        System.out.println("Livro instanciado com sucesso!");
    }

    public Livro02(String titulo, String autor, int numeroPaginas) {
        this(titulo, autor);
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public Livro02(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = 100;

    }

    public void setNumeroPaginas(int NumeroPaginas) {
        if (NumeroPaginas < 10) {
            System.out.println("ERRO, paginas menor do que 10");
            return;
        }
        this.numeroPaginas = NumeroPaginas;
    }

    public void imprimir() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Numero de Paginas: " + this.numeroPaginas);
    }
}
