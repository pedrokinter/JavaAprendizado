package pedro.projetojava.javacore.Gassociacao.dominiosExercicios;

import java.util.ArrayList;

public class departamentoExercicio03 {
    private String nome;
    private ArrayList<funcionarioExercicio03> funcionarios;
    private empresaExercicio03 empresa;



    public departamentoExercicio03(String nome) {

        this.nome = nome;
    }

    public void exibirDepartamentos () {
        System.out.println("Nome do departamento: " + nome);
        System.out.println("Funcionarios: ");
        for (int i = 0; i < funcionarios.size(); i++) {
            funcionarioExercicio03[] teste = new funcionarioExercicio03[funcionarios.size()];
            for (int j = 0; j < funcionarios.size(); j++) {
                teste[i] = funcionarios.get(j);
            }
            for (funcionarioExercicio03 f : funcionarios) {
                System.out.println(f.getNome());
            }
        }




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
