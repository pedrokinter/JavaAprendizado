package pedro.ProjetoJava.javacore.Kenumeracao.teste;

import pedro.ProjetoJava.javacore.Kenumeracao.dominio.Cliente;
import pedro.ProjetoJava.javacore.Kenumeracao.dominio.TipoCliente;
import pedro.ProjetoJava.javacore.Kenumeracao.dominio.TipoPagamento;

public class clienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Pedro", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Mathias", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);
    }
}
