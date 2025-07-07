package pedro.projetojava.javacore.Gassociacao.exercicios;

import pedro.projetojava.javacore.Gassociacao.dominiosExercicios.departamentoExercicio03;
import pedro.projetojava.javacore.Gassociacao.dominiosExercicios.empresaExercicio03;
import pedro.projetojava.javacore.Gassociacao.dominiosExercicios.funcionarioExercicio03;

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
        departamentoExercicio03 departamento = new departamentoExercicio03();
        funcionarioExercicio03 funcionario = new funcionarioExercicio03();

        ArrayList<departamentoExercicio03> departamentosArray = new ArrayList<>();
        ArrayList<funcionarioExercicio03> funcionariosArray = new ArrayList<>();


        departamento.setEmpresa(empresa);

        while (true) {
            System.out.println("Digite o nome dos departamentos: ");
                departamentoExercicio03 departamentoTeste = new departamentoExercicio03(ler.nextLine());

                departamentosArray.add(departamentoTeste);

                empresa.setDepartamentos(departamentosArray);

            System.out.println("Digite o nome do funcionario que pertence a esse departamento: ");
                funcionarioExercicio03 funcionarioTeste = new funcionarioExercicio03(ler.nextLine(), ler.nextDouble());

                funcionariosArray.add(funcionarioTeste);

                funcionarioTeste.setDepartamento(departamento);

                departamentosArray.add(0, departamento);
            break;
        }

        System.out.println("--------------------------------------------------------------");


        empresa.exibirEmpresa();
        departamento.exibirDepartamentos();
        funcionario.exibirFuncionario();


    }
}
