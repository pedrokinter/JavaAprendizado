package pedro.ProjetoJava.javacore.Gassociacao.testeAula;


import pedro.ProjetoJava.javacore.Gassociacao.dominio.Escola;
import pedro.ProjetoJava.javacore.Gassociacao.dominio.Professor;

public class professorTest {
    public static void main(String[] args) {
        Professor professor = new Professor("Pedro");
        Professor professor1 = new Professor("Joao");

        Professor[] professores = {professor, professor1};
        Escola escola = new Escola("Mario Toledo");

        escola.setProfessores(professores);

        escola.imprimir();

        // aq é um relacionamento unidirecional de muitos para um
    }
}
