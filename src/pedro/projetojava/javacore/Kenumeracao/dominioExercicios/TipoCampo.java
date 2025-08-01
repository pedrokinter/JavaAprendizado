package pedro.projetojava.javacore.Kenumeracao.dominioExercicios;

public enum TipoCampo implements Validavel{
    EMAIL,
    CPF,
    TELEFONE;

    @Override
    public boolean validar(String entrada) {
        if (entrada.contains("@") && entrada.contains(".")) {
            System.out.println("Isso é um email.");
            return true;
        } else if (entrada.length() == 14 && entrada.contains(".")) {
            System.out.println("Isso é um CPF.");
            return true;
        } else if (entrada.startsWith("9") && entrada.length() == 10) {
            System.out.println("Isso é um telefone.");
            return true;
        } else {
            return false;
        }

    }
}
