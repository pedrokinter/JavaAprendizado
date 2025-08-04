package pedro.ProjetoJava.javacore.Kenumeracao.exercicios;

import pedro.ProjetoJava.javacore.Kenumeracao.dominioExercicios.Mes;

public class MesTeste {
    public static void main(String[] args) {
        for (Mes m : Mes.values()) {
            System.out.print("Mês: " + m + " || Estação: ");
            System.out.println(m.estacoes());
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        }
    }
}
