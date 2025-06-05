package pedro.projetojava.javacore.Bintroduçaometodos.dominio;

public class ImpressoraEstudante {
    public void imprimirEstudante(Estudante estudante) {
        // estudante é PARAMETRO, e esta dentro do METODO imprime, e recebe a REFERENCIA de cada objeto das variaveis
        // estudante01 e estudante02, se comportando nesse MOMENTO como esse objeto.
        // dps printando a porra toda.

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        // classe filha 2
        // impressora puxa os dados do banco de dados de test, e junta as informaçoes com o objeto pai
        // e depois imprime. e logo depois de imprimir ela libera espaço e repete td dnv;

        // ela ta usando de referencia apenas o original (estudante/pai) e o teste fornece os dados pra ela imprimir com base no
        // objeto de referencia (estudante)

    }
}
