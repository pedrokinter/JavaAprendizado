package pedro.projetojava.javacore.Bintroduçaometodos.dominioExercicios;

public class Produto013 {
    public String nome;
    public double preco;
    public int quantidade;

    public int adicionarQtd (int add) {
        return this.quantidade += add;
    }

    public int removerQtd (int remover) {
        return this.quantidade - remover;
    }

    public void calcularTotal () {
        System.out.println("O preço total do produto é igual a: " + this.preco*this.quantidade);
    }

    public String exibirDados () {
        return "Nome: " + this.nome + ", Preço: " + this.preco + ", Quantidade: " +quantidade;

    }
}
