package pedro.projetojava.javacore.Gassociacao.exercicios;

import pedro.projetojava.javacore.Gassociacao.dominiosExercicios.departamentoExercicio03;
import pedro.projetojava.javacore.Gassociacao.dominiosExercicios.empresaExercicio03;
import pedro.projetojava.javacore.Gassociacao.dominiosExercicios.funcionarioExercicio03;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome da sua empresa: ");
            String nomeEmpresa = ler.nextLine();
        System.out.println("Agora o CNPJ: ");
            String cnpjEmpresa = ler.nextLine();

        empresaExercicio03 empresa = new empresaExercicio03(nomeEmpresa, cnpjEmpresa);

        departamentoExercicio03 departamento = new departamentoExercicio03("oi");

        ArrayList<departamentoExercicio03> departamentosArray = new ArrayList<>();

        funcionarioExercicio03 funcionario = new funcionarioExercicio03();

        departamentosArray.add(departamento);

        departamento.setEmpresa(empresa);

        empresa.setDepartamentos(departamentosArray);

        empresa.exibirEmpresa();


    }
}
