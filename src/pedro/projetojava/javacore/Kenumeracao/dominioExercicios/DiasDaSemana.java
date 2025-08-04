package pedro.ProjetoJava.javacore.Kenumeracao.dominioExercicios;

public enum DiasDaSemana {
    SEGUNDA_FEIRA("Segunda-Feira"),
    TERCA_FEIRA("Terca-Feira"),
    QUARTA_FEIRA("Quarta-Feira"),
    QUINTA_FEIRA("Quinta-Feira"),
    SEXTA_FEIRA("Sexta-Feira"),
    SABADO("Sábado"),
    DOMINGO("Domingo"),;

    private final String nomeDia;

    DiasDaSemana(String nomeDia) {
        this.nomeDia = nomeDia;
    }

    public static DiasDaSemana buscarPorNome(String nomeDia) {
        for (DiasDaSemana dia : values()) {
            if (dia.getNomeDia().equalsIgnoreCase(nomeDia)) {
                return dia;
            }
        }
        return null;
    }

    public String getNomeDia() {
        return nomeDia;
    }

}
