package pedro.projetojava.javacore.Dconstrutores.dominioExercicios;

public class calculadoraStatic07 {
        private static double resultado;



    public static void somar(double a, double b) {
        calculadoraStatic07.resultado = a+b;
        System.out.println("A soma dos valores é igual: " + calculadoraStatic07.resultado);


    }

    public static void subtrair(double a, double b) {
        calculadoraStatic07.resultado = a-b;
        System.out.println("A subtração dos valores é igual: " + calculadoraStatic07.resultado);

    }

    public static void multiplicar(double a, double b) {
        calculadoraStatic07.resultado = a*b;
        System.out.println("A multiplicação dos valores é igual: " + calculadoraStatic07.resultado);

    }

    public static void dividir(double a, double b) {
        calculadoraStatic07.resultado = a/b;
        System.out.println("A divisão dos valores é igual: " + calculadoraStatic07.resultado);

    }


}
