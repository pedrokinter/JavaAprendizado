package pedro.projetojava.javacore.Bintroduçaometodos.dominioExercicios;

public class Lampada009 {
    public boolean ligada;
    public int potencia; // watts
    public double consumo; // kWh acumulado

    public void ligarALampada(){
        ligada = true;
        System.out.println("Ligando a lampada..");
    }

    public void usar(double horas) {
        if (ligada) {
            consumo += (potencia / 1000.0) * horas;
        } else {
            System.out.println("Primeiro, ligue a lâmpada e tente novamente");

        }
    }

    public void mostrarStatus () {
        if (ligada) {
            System.out.println("O Consumo que ocorreu da Lâmpada é igual a: " + consumo + "kWh");
        }
    }

    public void desligarLampada() {
        ligada = false;
        System.out.println("Desligando a lampada..");
    }
}

// colocar uma pergunta se quer ligar a lampada, se quer desligar a lampada, quantas horas quer e no final dar todos os
// detalhes do consumo (amanha)
