package pedro.projetojava.javacore.Kenumeracao.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    public final int VALOR;

    TipoCliente(int valor) {
        this.VALOR = valor;
    }

    public int getVALOR() {
        return VALOR;
    }
}
