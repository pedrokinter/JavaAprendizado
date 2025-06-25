package pedro.projetojava.javacore.Dconstrutores.dominioExercicios;

public class lojaDeTaxa08 {
    private String nome;
    private double preco;
    private static double taxaImposto;

    public lojaDeTaxa08(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double calcularPrecoComImposto(double preco) {
        this.preco = preco;
        return preco + (preco *  taxaImposto / 100);
    }

    public static double setTaxaImposto(double taxaImposto) {
        lojaDeTaxa08.taxaImposto = taxaImposto;
        return lojaDeTaxa08.taxaImposto;
    }


    public void exibirDados() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Nome: " + this.nome);
        System.out.println("Preco: " + this.preco);
        System.out.println("Preço com imposto: " + calcularPrecoComImposto(this.preco));
        System.out.println("Taxa Imposto: " + lojaDeTaxa08.taxaImposto);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-");

    }

}
