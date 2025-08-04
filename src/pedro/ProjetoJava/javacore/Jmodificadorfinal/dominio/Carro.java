package pedro.ProjetoJava.javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador comprador = new Comprador(); //  a referencia que a variavel comprador tem
    // para este objeto, nunca podera ser alterada

    public final void imprimir() {
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
