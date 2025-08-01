package pedro.projetojava.javacore.Lclassesabstratas.exercicios;

import pedro.projetojava.javacore.Lclassesabstratas.dominiosExercicios.GerenteAbstrato;
import pedro.projetojava.javacore.Lclassesabstratas.dominiosExercicios.VendedorAbstrato;

public class funcionarioTeste {
    public static void main(String[] args) {
        GerenteAbstrato gerente = new GerenteAbstrato("Pedrinhu", 2000);
        VendedorAbstrato vendedo = new VendedorAbstrato("kintazinhooooooo", 3000);


        System.out.println(gerente);

        gerente.mostrarDados();
    }
}
