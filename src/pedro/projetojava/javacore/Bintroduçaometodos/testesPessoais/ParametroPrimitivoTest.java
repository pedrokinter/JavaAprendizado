package pedro.projetojava.javacore.Bintroduçaometodos.testesPessoais;

import pedro.projetojava.javacore.Bintroduçaometodos.dominiosTestesPessoais.ParametroPrimitivo;

public class ParametroPrimitivoTest {
    public static void main(String[] args) {
        ParametroPrimitivo est = new ParametroPrimitivo();
        System.out.println("Dentro de pessoazinhaTest");

        int a = 10;
        int b = 20;
        System.out.println(a+b);
        System.out.println("--------------------");
        System.out.println("Dentro de pessoazinha (classe)");
        est.somar(a, b);

        // oq eu quero mostrar com esse codigo é q o num 1 e num 2 vao passar uma copia, mas qnd eu chamo o metodo
        // o num1 e num2 viram os numeros dentro do metodo, e passam a soma q ta dentro do metodo.

        // por isso q tem q ficar atento, e isso n importa se muda o nome da variavel, pq sao posiçoes entende?

        // O valor original não foi modificado, somente o valor dentro do método foi modificado.
        // Caso precise salvar este valor em uma váriavel, tem que modificar o metodo (ao inves de void, colocar int)
        // e dar um return dentro do método para conseguir guardar o novo valor dentro de uma variavel int.
    }
}
