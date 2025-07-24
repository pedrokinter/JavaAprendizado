package pedro.projetojava.javacore.Lsobrescrita.dominios;

public class animeSobrescrito {
    private String nome;



    public String toString() {
        return "Anime: " + this.nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
