package pedro.projetojava.javacore.Jmodificadorfinal.dominio;

public class DocumentoExercicio {
    private String titulo;
    private String autor;

    public final void imprimir() {
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Autor: "+this.autor);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
