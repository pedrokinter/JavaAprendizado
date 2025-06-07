package pedro.projetojava.javacore.Bintroduçaometodos.dominioExercicios;

public class Temperatura012 {
    public double temperatura;
    public String tipo;
    public double celsiusParaFahrenheit () {
        return (this.temperatura * 9/5) + 32;
    }

    public double fahrenheitParaCelsius () {
        return (this.temperatura - 32) / 1.8;
    }

    public double celsiusParaKelvin () {
        return this.temperatura + 273.15;
    }

}
