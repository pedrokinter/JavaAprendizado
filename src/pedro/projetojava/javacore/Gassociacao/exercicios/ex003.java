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

            ArrayList<departamentoExercicio03> departamentos = new ArrayList<>();


        while (true){
            ArrayList<funcionarioExercicio03> funcionarios = new ArrayList<>(); // joguei o array pra dentro, ai ele reseta

            System.out.println("Digite os departamentos da sua empresa: ");

                departamentoExercicio03 d1 = new departamentoExercicio03(ler.nextLine());

                departamentos.add(d1);
                empresa.setDepartamentos(departamentos);

            System.out.println("Digite o funcionario do departamento e seu salário: ");

                funcionarioExercicio03 f1 = new funcionarioExercicio03(ler.nextLine(), ler.nextDouble());
                ler.nextLine();


                d1.setFuncionarios(funcionarios);

                f1.setDepartamento(d1);

                d1.getFuncionarios().add(f1); // aq ele ja adiciona direto no departamento o funcionario

            System.out.println("quer sair? ");
                String perg = ler.nextLine();
                if (perg.equals("sim")){
                break;
                }
        }

        empresa.exibirEmpresa();

    }
}
