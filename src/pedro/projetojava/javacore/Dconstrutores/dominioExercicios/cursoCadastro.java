package pedro.projetojava.javacore.Dconstrutores.dominioExercicios;

import java.util.Arrays;

public class cursoCadastro {
    private String nomeCurso;
    private String [] alunos = new String[5];
    private String [] matriculas = new String[5];
    private int indice;
    alunoCadastro aluno = new alunoCadastro();

    {
        System.out.println("Curso criado com capacidade para 5 alunos");
    }

    public cursoCadastro(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }


    public void matricularAluno (alunoCadastro aluno){
        this.alunos[this.indice] = aluno.getNome();
        this.matriculas[this.indice] = aluno.getMatricula();
        this.indice += 1;
    }

    public void matricularAluno (String nome, String matricula){

        aluno.setNome(nome);
        aluno.setMatricula(matricula);
        matricularAluno(aluno);
    }


    public void exibirAlunos() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Nome do curso: " + this.nomeCurso.toUpperCase());
        System.out.println("Alunos cadastrados: " + Arrays.toString(alunos));
        System.out.println("Matriculas do curso: " + Arrays.toString(matriculas));
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }




    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String[] getAlunos() {
        return alunos;
    }

    public void setAlunos(String[] alunos) {
        this.alunos = alunos;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        if (indice > 5) {
            System.out.println("erro, indice maior q 5 ");
            return;
        }
        this.indice = indice;
    }


}
