package pedro.ProjetoJava.javacore.Lclassesabstratas.dominiosExercicios;

public class VendedorAbstrato extends FuncionarioAbstrato {
    public VendedorAbstrato(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calculaSalario() {
        salarioBase += salarioBase * 0.10;
        return salarioBase;
    }

    @Override
    public String toString() {
        return "VendedorAbstrato{" +
                "nome='" + nome + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
