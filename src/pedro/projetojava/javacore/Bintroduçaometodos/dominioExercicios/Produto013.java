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
        System.out.println("O preço total do produto é igual a: R$" + this.preco*this.quantidade);
    }

    public String exibirDados (Produto013 produto) {
        return "Nome: " + this.nome + ", Preço: R$" + this.preco + ", Quantidade: " +quantidade+ " Preço Total: R$"
                + this.preco*this.quantidade;

    }
}
