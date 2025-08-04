package pedro.ProjetoJava.javacore.Gassociacao.exercicios;

import pedro.ProjetoJava.javacore.Gassociacao.dominiosExercicios.departamentoExercicio03;
import pedro.ProjetoJava.javacore.Gassociacao.dominiosExercicios.empresaExercicio03;
import pedro.ProjetoJava.javacore.Gassociacao.dominiosExercicios.funcionarioExercicio03;

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

            ArrayList<departamentoExercicio03> departamentos = new ArrayList<>();


        while (true){
            ArrayList<funcionarioExercicio03> funcionarios = new ArrayList<>(); // joguei o array pra dentro, ai ele reseta

            System.out.println("Digite os departamentos da sua empresa: ");

                departamentoExercicio03 novoDepartamento = new departamentoExercicio03(ler.nextLine());

                departamentos.add(novoDepartamento);


            System.out.println("Digite o funcionario do departamento e seu salário: ");

                funcionarioExercicio03 novoFuncionario = new funcionarioExercicio03(ler.nextLine(), ler.nextDouble());
                ler.nextLine();


                novoFuncionario.setDepartamento(novoDepartamento);

                novoDepartamento.getFuncionarios().add(novoFuncionario); // aq ele ja adiciona direto no departamento o funcionario

            System.out.println("quer sair? ");
                String perg = ler.nextLine();
                if (perg.equals("sim")){
                break;
                }
        }

        empresa.setDepartamentos(departamentos);
        empresa.exibirEmpresa();

    }
}
