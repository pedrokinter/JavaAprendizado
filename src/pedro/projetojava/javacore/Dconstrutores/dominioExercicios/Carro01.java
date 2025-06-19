package pedro.projetojava.javacore.Dconstrutores.dominioExercicios;

public class Carro01 {
    private String modelo;
    private String ano;
    private double velocidade;
    private double teste;

    {
        System.out.println("Carro criado!");
    }

    public Carro01(String modelo, String ano, double velocidade) {
        this(modelo, ano);
        this.velocidade = velocidade;
    }

    public Carro01(String modelo, String ano) {
        this.modelo = modelo;
        this.ano = ano;
    }



    public double acelerar() {
        return velocidade += 10;
    }

    public double acelerar(double incremento){
        teste += incremento;
        return velocidade += incremento;
    }

    public double getTeste() {
        return teste;
    }

    public void imprimir() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Velocidade em  km/h: " + this.velocidade);
    }

}
