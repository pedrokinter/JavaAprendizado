package pedro.projetojava.javacore.Dconstrutores.dominioExercicios;

public class Livro02 {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    {
        System.out.println("Livro instanciado com sucesso!");
    }

    public Livro02(String titulo, String autor, int numeroPaginas) {
        this(titulo, autor); // ja atribui o titulo e o autor aqui, ai eu so preciso passar o numero de paginas por aq

        if (numeroPaginas < 10) {
            System.out.println("ERRO: numero de paginas < 10, usarei o valor 100");
            this.numeroPaginas = 100;
        } else {
            this.numeroPaginas = numeroPaginas;
        } // validaçao do mesmo jeito q tem no set
        // pq se alguem tentar validar pelo objeto pode dar merda entende, ai ele consegue botar < 10

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
