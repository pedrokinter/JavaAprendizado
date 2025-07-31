package pedro.projetojava.javacore.Lclassesabstratas.testes;

import pedro.projetojava.javacore.Lclassesabstratas.dominios.Gerente;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Gerente g = new Gerente("pedro", 2000);

        System.out.println(g);

        g.imprimir();
    }
}
