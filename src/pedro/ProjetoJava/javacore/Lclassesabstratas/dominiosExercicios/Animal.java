package pedro.projetojava.javacore.Lclassesabstratas.dominiosExercicios;

public abstract class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public abstract void emitirSom();

    public void mostrarNome() {
        System.out.println("Nome: " + this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
