package pedro.ProjetoJava.javacore.Bintroduçaometodos.dominiosTestesPessoais;

public class Calculadora {
    public double a;
    public double b;
    public double resultado;

    public  double somar (double a, double b) {
        return resultado = a+b;
    }

    public double subtrair(double a, double b) {
        return resultado = a-b;
    }

    public double multiplicar(double a, double b) {
        return resultado = a*b;
    }

    public double dividir(double a, double b) {
        if (a == 0 || b == 0){
            return 0;
        } else {
            resultado = a / b;
        }
        return 0;
    }

    public double getResultado()  {
        return this.resultado;
    }
}
