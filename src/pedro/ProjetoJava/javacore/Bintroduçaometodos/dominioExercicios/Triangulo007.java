package pedro.ProjetoJava.javacore.Bintroduçaometodos.dominioExercicios;

public class Triangulo007 {
    public int lado1; // 5 // 10
    public int lado2; // 5 // 5
    public int lado3; // 10 // 5
    public String tipo;
    public String tipoTriangulo () {
        if (lado1 == lado2 && lado1 == lado3){
            tipo = "Equilatero";
        } else if (lado1 == lado2 && lado1 != lado3 || lado2 == lado3 && lado2 != lado1 || lado3 == lado1 && lado3 != lado2){
            tipo = "Isosceles";
        } else if (lado1 != lado2 && lado1 != lado3){
            tipo = "Escaleno";
        }

        return tipo;
    }
}
