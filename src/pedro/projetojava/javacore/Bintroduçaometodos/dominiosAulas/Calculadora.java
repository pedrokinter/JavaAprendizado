package pedro.projetojava.javacore.Bintroduçaometodos.dominiosAulas;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10+10);
    }
    // public é modificador de acesso

    public void subtraiDoisNumeros() {
        System.out.println(21-2);
    }

    public void multiplicaDoisNumeros(int num, int num2) {
        System.out.println(num*num2);
        // aq, eu irei colocar 2 numeros em outra classe, assim chamando esse parametro e chamando a saida do print de
        // num * num2;
        // nao posso colocar mais de 2 numeros, a nao ser que eu adicione mas variaveis locais dentro do parametro
        // assim como tambem nao posso colocar mais de 2 numeros nos argumentos da outra classe
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num1 == 0 || num2 == 0){
            return 0;
            // aq basicamente ele vai funcionar como um "break" e retornar 0, bem útil por sinal;
        }
        return num1/num2;

    }

    public double divideDoisNumeros02(double num1, double num2) {
        if (num1 == 0 || num2 == 0){
            return 0;
        }  else {
            return num1 / num2;
            // ta fazendo a mesma coisa que o de cima porem com um pouco mais de código;
        }
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if(num2 == 0 || num1 == 0){
            System.out.println("Não existe divisão por 0");
            return;
            // basicamente é o break dos metodos void.
            // ele vai ver se num2 é igual a 0 ou num1 é igual a 0, se for ele vai dar a saida do sout
            // e dps vai dar um return, assim retornando pra outra classe e printando a saida de não existe divisao por 0;
        }
        System.out.println(num1/num2);
    }

    public void alteraDoisNumeros (int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println(num1);
        System.out.println(num2);
    }
}
