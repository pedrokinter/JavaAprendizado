package pedro.projetojava.javacore.Lclassesabstratas.dominiosExercicios;

public abstract class Forma {
    private double largura;
    private double altura;


    public Forma() {
    }

    public Forma(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();


    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
