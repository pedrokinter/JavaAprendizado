package pedro.projetojava.javacore.Kenumeracao.dominioExercicios;

public class Agenda {
    private DiasDaSemana diaSemana;

    public Agenda(DiasDaSemana diaSemana) {
        this.diaSemana = diaSemana;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "DiaSemana=" + diaSemana.getNomeDia() +
                '}';
    }

    public void imprimirDia(){
        System.out.println("Que belo(a) " + diaSemana.getNomeDia() + " está sendo hoje, henrique!!");
    }

    public DiasDaSemana getDiaSemana() {
        return diaSemana;
    }
}
