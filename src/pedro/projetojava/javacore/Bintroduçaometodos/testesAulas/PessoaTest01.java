package pedro.projetojava.javacore.Bintroduçaometodos.testesAulas;

import pedro.projetojava.javacore.Bintroduçaometodos.dominiosAulas.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        // pessoa.nome = "pedro"
        pessoa.setNome("Pedro");
        pessoa.setIdade(25);

        System.out.println(pessoa.getNome());
    }
}
