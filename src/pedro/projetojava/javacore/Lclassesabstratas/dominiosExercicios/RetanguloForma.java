package pedro.projetojava.javacore.Lclassesabstratas.dominiosExercicios;

public class RetanguloForma extends Forma {
    private double largura;
    private double altura;

    public RetanguloForma(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return getLargura() * getAltura();

    }

    public double calcularPerimetro() {
        return (getLargura() + getAltura()) * 2;
    }

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
