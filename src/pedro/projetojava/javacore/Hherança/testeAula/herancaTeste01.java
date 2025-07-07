package pedro.projetojava.javacore.Hherança.testeAula;

import pedro.projetojava.javacore.Hherança.dominio.Endereco;
import pedro.projetojava.javacore.Hherança.dominio.Funcionario;
import pedro.projetojava.javacore.Hherança.dominio.Pessoa;

public class herancaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Endereco endereco = new Endereco();
        Funcionario funcionario = new Funcionario();

        endereco.setRua("jacinto pinto");
        endereco.setCep("0777-77");

        pessoa.setNome("Pedro");
        pessoa.setCpf("123456789");
        pessoa.setEndereco(endereco);

        funcionario.setNome("Bernardo");
        funcionario.setCpf("987654321");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(10000);

        pessoa.imprimir();
        System.out.println("----------------");
        funcionario.imprimir();
    }
}
