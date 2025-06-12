package pedro.projetojava.aulas;

public class aula004 {
    public static void main(String[] args) {
        // +, -, /, *

        //int number01 = 10;
        //int number02 = 20; 
        // se tiver 2 numeros inteiros e tentar fazer uma variavel de soma com um double
        // nao vai dar certo, pois precisa de pelo menos 1 double nas variaveis que vão ser somadas.

        // %
        int resto = 21 % 7;
        System.out.println(resto); // retorna 0 

        // < > <= >= == 

        boolean dezmenorquevinte = 10 < 20;
        boolean dezmaiorquevinte = 10 > 20;
        System.out.println(dezmenorquevinte);  //retorna true
        System.out.println(dezmaiorquevinte); //retorna false

        //essas fita ai mesmo 

        //&& (and); || (or); !

        // se a idade for menor que 30 e o salarios maior que 3500, o cidadão está na lei, caso ao contrario, ele não esta (respectivamente: true e false)
        int idade = 29;
        float salario = 3500f;
        boolean dentroDaLeiMaiorqueTrinta = idade >= 30 && salario >= 4612; //ele vai retornar em ambos os boolean o que foi pedido, que é verificar se o individuo esta dentro da lei prevista.
        boolean dentroDaLeiMenorqueTrinta = idade < 30 && salario >= 3381;
        System.out.println(dentroDaLeiMaiorqueTrinta);
        System.out.println(dentroDaLeiMenorqueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean oPlaystationDaPraComprar = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("da pra comprar sa porra" + oPlaystationDaPraComprar);

        // =, +=, -=, *=, /=, %=
        double bonus = 1000; //1000
        bonus += 1000; //2000
        bonus -= 1000; // 1000
        bonus *= 2; // 2000
        bonus /= 2; // 1000
        bonus %= 2; // 0.
        System.out.println(bonus);

        //
        int test = 0;
        test+= 1; // contador = contador +1;
        test++; // mesma coisa que contador += 1
        test--; //mesma coisa que contador -= 1
        System.out.println(test);
        // ele vai ler as duas condiçoes, se alguma delas for maior e der o resultado pedido, ele retornara TRUE no terminal
        // ele quer saber qual das contas tem o valor maior que o do playstation pra comprar sa bomba
    } 
    
}
