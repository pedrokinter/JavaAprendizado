package pedro.ProjetoJava.javacore.Bintroduçaometodos.dominiosAulas;

public class Estudante {
    public String nome; // isso é um atributo
    public int idade;
    public char sexo;

    public void imprime() {
        String oi = "Oi"; // isso é uma variavel
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
        System.out.println("Oi");
        // this é o contexto/espaço desse objeto
        // this é pra falar que quer usar a variavel de classe, q foi declarada aq.
    }
    // classe pai
    // só possui as informaçoes basicas
}
