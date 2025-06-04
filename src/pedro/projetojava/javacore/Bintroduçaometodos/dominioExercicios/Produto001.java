package pedro.projetojava.javacore.Bintroduçaometodos.dominioExercicios;

public class Produto001 {
    public String nome;
    public double preco;

    public double calcularDesconto() {
        return preco - preco * 0.10;
    }
}
