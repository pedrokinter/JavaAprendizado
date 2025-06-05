package pedro.projetojava.javacore.Bintroduçaometodos.dominio;

public class ImpressoraEstudante {
    public void imprimirEstudante(Estudante estudante) {

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        // a variavel de referencia estudante vai fazer referencia ao objeto chamado na outra classe
        // exemplo: estudante01

        // ai mata a variavel local, p fazer isso dnv com um estudante02 por ex.
    }
}
