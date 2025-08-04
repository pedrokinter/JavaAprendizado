package pedro.projetojava.javacore.Gassociacao.testeAula;


import pedro.projetojava.javacore.Gassociacao.dominio.Escola;
import pedro.projetojava.javacore.Gassociacao.dominio.Professor;

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
