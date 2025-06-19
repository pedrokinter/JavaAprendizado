package pedro.projetojava.javacore.Dconstrutores.dominioExercicios;

public class Livro02 {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    {
        System.out.println("Livro instanciado com sucesso!");
    }

    public Livro02(String titulo, String autor, int numeroPaginas) {
        this(numeroPaginas);
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public Livro02(int NumeroPaginas) {
        numeroPaginas = 100;
        this.numeroPaginas = NumeroPaginas;
    }

    public void setNumeroPaginas(int NumeroPaginas) {
        if (NumeroPaginas > 10) {
            this.numeroPaginas = NumeroPaginas;
        }
    }
}
