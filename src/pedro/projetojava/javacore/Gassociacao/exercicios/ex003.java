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
        departamentoExercicio03 departamento = new departamentoExercicio03();

        funcionarioExercicio03 funcionario = new funcionarioExercicio03();


        while (true){
            System.out.println("Digite o nome do departamento: ");
            
            System.out.println("quer sair?: ");
            String sair = ler.nextLine();
            if (sair.equals("sim")){
                break;
            } else {
                continue;
            }
        }

        empresa.exibirEmpresa();


    }
}
