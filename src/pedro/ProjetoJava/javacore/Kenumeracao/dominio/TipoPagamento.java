package pedro.ProjetoJava.javacore.Kenumeracao.dominio;

public enum TipoPagamento {
    DEBITO{
        @Override
        public double calcularDesconto(double valor){
            return valor * 0.10;
        }
    },
    CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.15;
        }
    };

    public abstract double calcularDesconto(double valor);
}
