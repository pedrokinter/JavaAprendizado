package pedro.projetojava.javacore.Bintroduçaometodos.dominioExercicios;

public class Livro018 {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }


    public void setNumeroPaginas(int numeroPaginas) {
        if (numeroPaginas < 1) {
            System.out.println("ERRO, Valor menor que 0");
        } else {
            this.numeroPaginas = numeroPaginas;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }



}
