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
        departamentoExercicio03 departamento0 = new departamentoExercicio03();
        funcionarioExercicio03 funcionario0 = new funcionarioExercicio03();

        ArrayList<departamentoExercicio03> departamentosArray = new ArrayList<>();
        ArrayList<funcionarioExercicio03> funcionariosArray = new ArrayList<>();



        while (true) {
            System.out.println("Digite o nome dos departamentos: ");
            departamentoExercicio03 departamento = new departamentoExercicio03(ler.nextLine());

            departamentosArray.add(departamento);

            departamento.setEmpresa(empresa);

            empresa.setDepartamentos(departamentosArray);

            System.out.println("Você quer parar de adicionar departamentos?: ");
            String resposta = ler.nextLine();
            if (resposta.equals("sim")) {
                break;
            }
        }

        System.out.println("--------------------------------------------------------------");

        while (true){
            System.out.println("Digite o nome dos funcionarios que pertencem aos departamentos: ");
                funcionarioExercicio03 funcionario = new funcionarioExercicio03(ler.nextLine());

            funcionariosArray.add(funcionario);

            departamento0.setFuncionarios(funcionariosArray);

            System.out.println("Você quer parar de adicionar funcionários?: ");
                String resposta = ler.nextLine();
                if (resposta.equals("sim")) {
                break;
                }
        }




        empresa.exibirEmpresa();
        departamento0.exibirDepartamentos();
        funcionario0.exibirFuncionario();


    }
}
