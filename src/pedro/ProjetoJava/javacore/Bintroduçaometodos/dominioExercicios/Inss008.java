package pedro.ProjetoJava.javacore.Bintroduçaometodos.dominioExercicios;

public class Inss008 {
    public String nome;
    public double salarioBruto;
    public double descontoINSS;

    public double salarioLiquido () {

        return salarioBruto - descontoINSS;
    }
}
