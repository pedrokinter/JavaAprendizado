package pedro.projetojava.javacore.Bintroduçaometodos.dominioExercicios;

public class Lampada009 {
    public boolean ligada;
    public int potencia; // watts
    public double consumo; // kWh acumulado

    public void ligar(){
        boolean ligada = true;
        System.out.println("Ligando a lampada..");
    }
    public void desligar(){
        boolean ligada = false;
    }

    public double usar(double horas){
        consumo += (potencia / 1000.0 ) * horas;
        return consumo;
    }

    public void mostrarStatus () {
        System.out.println("Consumo que ja ocorreu: " + consumo + " kWh");
        if (!ligada) {
            System.out.println("A lâmpada está desligada.");
        }
    }
}
