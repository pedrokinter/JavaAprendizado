package pedro.projetojava.javacore.Kenumeracao.dominioExercicios;

public enum DiasDaSemana {
    SEGUNDA_FEIRA(0) {
        @Override
        public void imprimir() {
            System.out.println("Segunda Feira");
        }
    },
    TERCA_FEIRA(1){
        @Override
        public void imprimir() {
            System.out.println("TERCA");
        }
    },
    QUARTA_FEIRA(2){
        @Override
        public void imprimir() {
            System.out.println("QUARTA");
        }
    },
    QUINTA_FEIRA(3){
        @Override
        public void imprimir() {
            System.out.println("QUINTA");
        }
    },
    SEXTA_FEIRA(4){
        @Override
        public void imprimir() {
            System.out.println("SSEXTA");
        }
    },
    SABADO(5){
        @Override
        public void imprimir() {
            System.out.println("SABADO");
        }
    },
    DOMINGO(6){
        @Override
        public void imprimir() {
            System.out.println("DOMINGO");
        }
    };

    public final double VALOR;

    DiasDaSemana(double valor) {
        this.VALOR = valor;
    }

    public double getVALOR() {
        return VALOR;
    }

    public  abstract void imprimir();


}
