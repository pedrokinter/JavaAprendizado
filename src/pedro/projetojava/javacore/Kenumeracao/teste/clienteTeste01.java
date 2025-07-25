package pedro.projetojava.javacore.Kenumeracao.teste;

import pedro.projetojava.javacore.Kenumeracao.dominio.Cliente;
import pedro.projetojava.javacore.Kenumeracao.dominio.TipoCliente;

public class clienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Pedro", TipoCliente.PESSOA_FISICA);

        System.out.println(cliente);
    }
}
