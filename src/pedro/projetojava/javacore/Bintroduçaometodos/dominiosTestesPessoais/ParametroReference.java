package pedro.projetojava.javacore.Bintroduçaometodos.dominiosTestesPessoais;

public class ParametroReference {
    public String nome;
    public int idade;
    public char sexo;

    public void imprimirTeste(ParametroReference pessoa) {
        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);
        System.out.println(pessoa.sexo);

    }
}
