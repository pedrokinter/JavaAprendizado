package pedro.projetojava.javacore.Lclassesabstratas.exercicios;

import pedro.projetojava.javacore.Lclassesabstratas.dominios.Funcionario;
import pedro.projetojava.javacore.Lclassesabstratas.dominiosExercicios.FuncionarioAbstrato;
import pedro.projetojava.javacore.Lclassesabstratas.dominiosExercicios.GerenteAbstrato;
import pedro.projetojava.javacore.Lclassesabstratas.dominiosExercicios.VendedorAbstrato;

import java.util.ArrayList;
import java.util.List;

public class funcionarioTeste {
    public static void main(String[] args) {
        List<FuncionarioAbstrato> funcionarios = new ArrayList<>();
        GerenteAbstrato gerente = new GerenteAbstrato("Pedrinhu", 2000);
        VendedorAbstrato vendedo = new VendedorAbstrato("kintazinhooooooo", 3000);

        funcionarios.add(gerente);
        funcionarios.add(vendedo);

        for (FuncionarioAbstrato funcionario : funcionarios) {
            funcionario.mostrarDados();
        }



    }
}
