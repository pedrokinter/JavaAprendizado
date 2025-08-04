package pedro.projetojava.javacore.Dconstrutores.dominioExercicios;

public class lojaDeTaxa08 {
    private String nome;
    private double preco;
    private static double taxaImposto;

    public lojaDeTaxa08(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public static void getTaxaImposto(double taxaImposto) {
        lojaDeTaxa08.taxaImposto = taxaImposto;
    }

    public double calcularPrecoComImposto() {
        return this.preco + (this.preco *  taxaImposto / 100);
    }



    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static void setTaxaImposto(double taxaImposto) {
        lojaDeTaxa08.taxaImposto = taxaImposto;
    }

    public void exibirDados() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Nome: " + this.nome);
        System.out.println("Preco: " + this.preco);
        System.out.println("Preço com imposto: R$ " + calcularPrecoComImposto());
        System.out.println("Taxa Imposto: " + lojaDeTaxa08.taxaImposto+ "%");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-");

    }

}
