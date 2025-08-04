package pedro.ProjetoJava.javacore.Lclassesabstratas.testes;

import pedro.ProjetoJava.javacore.Lclassesabstratas.dominios.Gerente;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Gerente g = new Gerente("pedro", 2000);

        System.out.println(g);

        g.imprimir();
    }
}
