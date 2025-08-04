package pedro.projetojava.javacore.Bintroduçaometodos.dominiosAulas;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    } // coloca dentro do atributo nome
    public void setIdade(int idade) {
        if (idade >= 18) {
            System.out.println("Idade <UNK> maior que 18");
            return;
        }
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

}
