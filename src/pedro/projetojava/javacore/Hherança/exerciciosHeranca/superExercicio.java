package pedro.projetojava.javacore.Hherança.exerciciosHeranca;

import pedro.projetojava.javacore.Hherança.dominioExercicio.Gerente;
import pedro.projetojava.javacore.Hherança.dominioExercicio.funcionarioSuper;

public class superExercicio {
    public static void main(String[] args) {
        funcionarioSuper funcionario = new funcionarioSuper("Travis", 2000);
        Gerente gerente = new Gerente("Travis", 2000, "Gerente do trap");

        funcionario.exibirDados();
        System.out.println("------------------");
        gerente.exibirDados();
    }
}
