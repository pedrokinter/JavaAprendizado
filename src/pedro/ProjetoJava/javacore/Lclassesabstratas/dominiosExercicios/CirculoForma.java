package pedro.ProjetoJava.javacore.Lclassesabstratas.dominiosExercicios;

public class CirculoForma extends Forma{
    private double raio;

    public CirculoForma(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return this.raio * this.raio * Math.PI;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * this.raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
