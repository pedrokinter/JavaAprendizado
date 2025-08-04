package pedro.ProjetoJava.javacore.Bintroduçaometodos.dominiosTestesPessoais;

public class ParametroReferencePt2 {
    public String nome;
    public int idade;

    public void modificarNome (ParametroReferencePt2 pessoa) {
        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);
        pessoa.nome = "Joao"; // Alteração no estado do objeto original
        // objeto em memoria que tem referencia pro nome
    }
}
