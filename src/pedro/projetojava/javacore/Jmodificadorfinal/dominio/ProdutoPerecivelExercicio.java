package pedro.ProjetoJava.javacore.Jmodificadorfinal.dominio;

public class ProdutoPerecivelExercicio  extends  ProdutoExercicio {
    private String dataValidade;

    public ProdutoPerecivelExercicio(String nome, double preco, String dataValidade) {
        super(nome, preco);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Produto: " +
                getNome()  +
                " | Preço: R$" + getPreco() + " | Data de Validade: " + this.dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
