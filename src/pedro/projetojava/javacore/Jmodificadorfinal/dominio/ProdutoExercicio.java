package pedro.ProjetoJava.javacore.Jmodificadorfinal.dominio;

public class ProdutoExercicio {
    private String nome;
    private double preco;

    public ProdutoExercicio(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    @Override
    public String toString() {
        return "Produto: " +
                nome  +
                " | Preço: R$" + preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
