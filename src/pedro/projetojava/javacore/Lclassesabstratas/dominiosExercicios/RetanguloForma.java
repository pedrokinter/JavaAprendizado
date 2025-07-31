package pedro.projetojava.javacore.Lclassesabstratas.dominiosExercicios;

public class RetanguloForma extends Forma {

    public RetanguloForma(double largura, double altura) {
       super(largura, altura);
    }

    public double calcularArea() {
        return getLargura() * getAltura();

    }

    public double calcularPerimetro() {
        return getLargura() + getAltura() * 2;
    }

}
