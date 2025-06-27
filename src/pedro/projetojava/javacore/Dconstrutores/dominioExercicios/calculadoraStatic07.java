package pedro.projetojava.javacore.Dconstrutores.dominioExercicios;

public class calculadoraStatic07 {
        private static double resultado;



    public static double somar(double a, double b) {
        return calculadoraStatic07.resultado = a+b;



    }

    public static double subtrair(double a, double b) {
        return calculadoraStatic07.resultado = a-b;


    }

    public static double multiplicar(double a, double b) {
        return calculadoraStatic07.resultado = a*b;


    }

    public static double dividir(double a, double b) {
        if (b == 0 || a == 0) {
            System.out.println("erro, divisao por zero");
            return Double.NaN;
        }

        return a/b;


    }




}
