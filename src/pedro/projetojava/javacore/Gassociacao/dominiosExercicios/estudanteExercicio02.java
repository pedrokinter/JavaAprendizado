package pedro.projetojava.javacore.Gassociacao.dominiosExercicios;

public class estudanteExercicio02 {
    private String nome;
    private int idade;
    private escolaExercicio02 escola;

    public estudanteExercicio02(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

    }


    public void exibirEstudante() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        if (escola != null) {
            System.out.println("Escola: " + escola.getNome());
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    public escolaExercicio02 getEscola() {
        return escola;
    }

    public void setEscola(escolaExercicio02 escola) {
        this.escola = escola;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
