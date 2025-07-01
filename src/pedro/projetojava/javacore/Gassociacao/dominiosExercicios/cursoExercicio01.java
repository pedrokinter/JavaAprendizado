package pedro.projetojava.javacore.Gassociacao.dominiosExercicios;

public class cursoExercicio01 {
    private String nome;
    private String cargaHoraria;
    private professorExercicio01 professor;

    public cursoExercicio01(String nome) {
        this.nome = nome;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("CargaHoraria: " + cargaHoraria);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public professorExercicio01 getProfessor() {
        return professor;
    }

    public void setProfessor(professorExercicio01 professor) {
        this.professor = professor;
    }

}
