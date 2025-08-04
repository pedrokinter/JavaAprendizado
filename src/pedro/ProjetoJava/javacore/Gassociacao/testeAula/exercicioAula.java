package pedro.projetojava.javacore.Gassociacao.testeAula;

import pedro.projetojava.javacore.Gassociacao.dominio.estudantesAula;
import pedro.projetojava.javacore.Gassociacao.dominio.localAula;
import pedro.projetojava.javacore.Gassociacao.dominio.professoresAula;
import pedro.projetojava.javacore.Gassociacao.dominio.seminarioAula;

import java.util.Scanner;

public class exercicioAula {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        estudantesAula estudantes = new estudantesAula();
        seminarioAula seminarios = new seminarioAula();
        professoresAula professores = new professoresAula();
        localAula local = new localAula();

        int cont = 0;

        System.out.println("Digite um seminario abaixo: ");
            while (true){
                seminarios.add(ler.nextLine());
                cont++;
                if (cont == 3){
                    break;
                }

            }

        System.out.println("Digite um local abaixo: ");
        local.setEndereco("rua do silva");
            seminarios.setLocal(local);

        System.out.println("Digite um professor abaixo:");
            professores.setNome("pedrinho");
            professores.setEspecialidade("quimico");
            professores.setSeminarios(seminarios);

        System.out.println("digite um aluno abaixo: ");
            estudantes.setNome("bernardo");
            estudantes.setIdade(18);
            estudantes.setSeminario(seminarios);


        seminarios.exibir();
    }
}
