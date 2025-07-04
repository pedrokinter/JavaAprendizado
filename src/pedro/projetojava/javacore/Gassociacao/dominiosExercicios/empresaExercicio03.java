package pedro.projetojava.javacore.Gassociacao.dominiosExercicios;

import java.util.ArrayList;

public class empresaExercicio03 {
    private String nome;
    private String CNPJ;
    private ArrayList<departamentoExercicio03> departamentos;



    public empresaExercicio03(String nome, String CNPJ) {
        this.nome = nome;
        this.CNPJ = CNPJ;
    }

    public void exibirEmpresa() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Nome da Empresa: " + this.nome);
        System.out.println("CNPJ da Empresa: " + this.CNPJ);
        System.out.println("Departamentos da Empresa: " + this.departamentos);


        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public ArrayList<departamentoExercicio03> getDepartamentos() {
        return this.departamentos;
    }

    public void setDepartamentos(ArrayList<departamentoExercicio03> departamentos) {
        this.departamentos = departamentos;
    }


}
