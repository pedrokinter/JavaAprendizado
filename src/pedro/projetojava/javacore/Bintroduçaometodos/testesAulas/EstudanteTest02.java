package pedro.projetojava.javacore.Bintroduçaometodos.testesAulas;

import pedro.projetojava.javacore.Bintroduçaometodos.dominiosAulas.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Pedro";
        estudante1.idade = 20;
        estudante1.sexo = 'M';

        estudante2.nome = "gabriel";
        estudante2.idade = 17;
        estudante2.sexo = 'F';

        estudante1.imprime();
        estudante2.imprime();
    }
}
