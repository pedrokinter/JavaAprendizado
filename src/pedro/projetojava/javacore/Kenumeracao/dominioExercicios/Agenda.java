package pedro.projetojava.javacore.Kenumeracao.dominioExercicios;

public class Agenda {
    private DiasDaSemana DiaSemana;

    public Agenda(DiasDaSemana diaSemana) {
        this.DiaSemana = diaSemana;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "DiaSemana=" + DiaSemana +
                '}';
    }

    public void imprimirDia(){
        System.out.println(DiaSemana);
    }

    public DiasDaSemana getDiaSemana() {
        return DiaSemana;
    }
}
