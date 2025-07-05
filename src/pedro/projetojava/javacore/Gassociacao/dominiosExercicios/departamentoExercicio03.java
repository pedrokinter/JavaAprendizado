package pedro.projetojava.javacore.Gassociacao.dominiosExercicios;

import java.util.ArrayList;

public class departamentoExercicio03 {
    private String nome;
    private ArrayList<funcionarioExercicio03> funcionarios;
    private empresaExercicio03 empresa;

    public departamentoExercicio03() {

    }

    public departamentoExercicio03(String nome) {
        this();
        this.nome = nome;
    }

    public void exibirDepartamentos () {
        System.out.println("Nome dos departamentos: ");
        for (int i = 0; i < empresa.getDepartamentos().toArray().length; i++) {
            System.out.println(empresa.getDepartamentos().toArray()[i]);
        }

        System.out.println("Lista de funcionarios: ");
        for (funcionarioExercicio03 funcionario : funcionarios) {
            System.out.print(funcionario.getNome() + " ");
        }
        System.out.println("\nNome da empresa que pertence: " + empresa.getNome());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public empresaExercicio03 getEmpresa() {
        return empresa;
    }

    public void setEmpresa(empresaExercicio03 empresa) {
        this.empresa = empresa;
    }

    public ArrayList<funcionarioExercicio03> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<funcionarioExercicio03> funcionarios) {
        this.funcionarios = funcionarios;
    }
}
