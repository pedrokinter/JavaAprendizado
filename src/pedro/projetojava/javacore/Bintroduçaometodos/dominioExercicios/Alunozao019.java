package pedro.projetojava.javacore.Bintroduçaometodos.dominioExercicios;

public class Alunozao019 {
    private String nome;
    private String matricula;
    private double [] notas = new double[3];

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void  setAdicionarNota(double [] nota){
        this.notas = nota;
    }
}
