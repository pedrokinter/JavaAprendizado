package pedro.projetojava.javacore.Gassociacao.dominiosExercicios;

public class escolaExercicio02 {
    private String nome;
    private estudanteExercicio02 [] estudantes;


    public escolaExercicio02(String nome) {
        this.nome = nome;
    }

    public escolaExercicio02(String nome, estudanteExercicio02 [] estudantes) {
        this.nome = nome;
        this.estudantes = estudantes;
    }

    public void exibirEscola() {
        System.out.println("Nome da escola: " + nome);
        for (estudanteExercicio02 estudante : estudantes) {
            System.out.println("Estudantes da escola: " + estudante.getNome());
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    public estudanteExercicio02[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(estudanteExercicio02[] estudantes) {
        this.estudantes = estudantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
