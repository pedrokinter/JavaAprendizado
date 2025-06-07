package pedro.projetojava.javacore.Bintroduçaometodos.dominioExercicios;

public class Retangulo011 {
    public double largura;
    public double altura;
    public double area;

    public double area(Retangulo011 retangulo) {
       return area = altura * largura;
    }

    public double perimetro(Retangulo011 retangulo) {
        return 2 * (altura + largura);

    }

    public boolean comparar(Retangulo011 retangulo) {
        if (this.area > retangulo.area) {
            System.out.println("O primeiro retângulo possui a maior área");
            return true;
        } else {
            System.out.println("O segundo retângulo possui a maior área");
            return false;
        }

    }

    public void teste(Retangulo011 retangulo) {
        if (this.area > retangulo.area) {
            System.out.println("area 1 > area 2");
        } else {
            System.out.println("area 1 < area 2");
        }
    }





}
