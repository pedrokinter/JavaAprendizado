package pedro.ProjetoJava.javacore.Fmodificadoresestatico.dominiosAulas;

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

    public static void setVelocidadeLimite (double velocidadeLimite)  {
        carro.velocidadeLimite = velocidadeLimite;
        // nao da pra acessar nenhuma variavel nao estatica dentro de um metodo estatico
        // POIS EXIST A POSSIBILIDADE DE NAO EXISTIR O OBJETO EM MEMORIA

    }

    public static double getVelocidadeLimite() {
        return carro.velocidadeLimite;
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




}
