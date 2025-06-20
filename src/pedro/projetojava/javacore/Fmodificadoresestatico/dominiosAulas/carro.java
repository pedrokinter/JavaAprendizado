package pedro.projetojava.javacore.Fmodificadoresestatico.dominiosAulas;

public class carro {
    private String marca;
    private double velocidadeMaxima;
    private static double velocidadeLimite;



    public carro(String marca, double velocidadeMaxima) {
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprimir() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidade: " + velocidadeMaxima);
        System.out.println("Velocidade limite: " + carro.velocidadeLimite);
        System.out.println("----------------------");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public void setVelocidadeLimite(double velocidadeLimite) {
        this.velocidadeLimite = velocidadeLimite;
    }
}
