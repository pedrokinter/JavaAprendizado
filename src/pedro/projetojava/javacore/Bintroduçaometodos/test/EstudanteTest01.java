package pedro.projetojava.javacore.Bintroduçaometodos.test;

import pedro.projetojava.javacore.Bintroduçaometodos.dominio.Estudante;
import pedro.projetojava.javacore.Bintroduçaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Pedro";
        estudante01.idade = 20;
        estudante01.sexo = 'M';

        estudante02.nome = "I name";
        estudante02.idade = 20;
        estudante02.sexo = 'F';

        //

        impressora.imprimirEstudante(estudante01);
        impressora.imprimirEstudante(estudante02);
    }
}
