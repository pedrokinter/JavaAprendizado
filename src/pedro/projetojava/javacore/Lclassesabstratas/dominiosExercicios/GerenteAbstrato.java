package pedro.ProjetoJava.javacore.Lclassesabstratas.dominiosExercicios;

public class GerenteAbstrato extends FuncionarioAbstrato {

    public GerenteAbstrato(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calculaSalario() {
        salarioBase += 2000;
        return salarioBase;
    }

    @Override
    public String toString() {
        return "GerenteAbstrato{" +
                "nome='" + nome + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
