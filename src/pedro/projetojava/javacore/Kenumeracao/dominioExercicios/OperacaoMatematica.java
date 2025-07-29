package pedro.projetojava.javacore.Kenumeracao.dominioExercicios;

public enum OperacaoMatematica {
    SOMA{
        @Override
        public double executar(double a, double b) {
            return a + b;
        }
    },
    SUBTRACAO{
        @Override
        public double executar(double a, double b) {
            return a - b;
        }
    },
    MULTIPLICACAO{
        @Override
        public double executar(double a, double b) {
            return a * b;
        }
    },
    DIVISAO{
        @Override
        public double executar(double a, double b) {
            if (a == 0 || b == 0) {
                System.out.println("erro, divisao por zero");
                return Double.NaN;
            }

            return a / b;
        }
    },;


    public abstract double executar(double a, double b);
}
