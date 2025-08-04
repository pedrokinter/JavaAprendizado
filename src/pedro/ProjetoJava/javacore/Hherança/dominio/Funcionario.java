package pedro.ProjetoJava.javacore.Hherança.dominio;

public class Funcionario  extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicializaççao estatico de Funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicializaççao estatico de Funcionario 1 ");

    }
    {
        System.out.println("Dentro do bloco de inicializaççao estatico de Funcionario 2 ");

    }

    public Funcionario(String nome) {

        super(nome);
        System.out.println("DENTRO DO CONSTRUTOR DE FUNCIONARIO");
    }

    public void imprime() {
        super.imprimir();
        System.out.println(this.salario);
    }



    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
