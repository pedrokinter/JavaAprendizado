package pedro.projetojava.javacore.Csobrecargamétodos.dominioExercicios;

public class produto001 {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return this.preco;
    }


    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;

    }

    public int getQuantidadeEmEstoque() {
        return this.quantidadeEmEstoque;
    }

    public void adicionarEstoque(int quantidade) {
        quantidadeEmEstoque += quantidade;
    }

    public void removerEstoque(int quantidade) {
        this.quantidadeEmEstoque -= quantidade;
        if (this.quantidadeEmEstoque < 0) {
            System.out.println("erro, estoque menor que zero, tente novamente");
            this.quantidadeEmEstoque += quantidade;
        }


    }

    public void exibirDetalhes () {
        System.out.println("Nome: " + getNome());
        System.out.println("Preco: R$" + getPreco());
        System.out.println("Quantidade em Estoque: " + getQuantidadeEmEstoque());
    }


}
