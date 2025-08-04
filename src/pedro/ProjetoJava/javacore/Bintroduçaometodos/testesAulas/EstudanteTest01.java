package pedro.ProjetoJava.javacore.Bintroduçaometodos.testesAulas;

import pedro.ProjetoJava.javacore.Bintroduçaometodos.dominiosAulas.Estudante;
import pedro.ProjetoJava.javacore.Bintroduçaometodos.dominiosAulas.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();
        // classe filha1
        // esta referenciando a classe pai
        // cria um banco de dados abaixo

        estudante01.nome = "Pedro";
        estudante01.idade = 20;
        estudante01.sexo = 'M';
        // a classe vai enviar esse primeiro banco de dados para impressora


        estudante02.nome = "I name";
        estudante02.idade = 20;
        estudante02.sexo = 'F';



        impressora.imprimirEstudante(estudante01);
        impressora.imprimirEstudante(estudante02);
    }
}
