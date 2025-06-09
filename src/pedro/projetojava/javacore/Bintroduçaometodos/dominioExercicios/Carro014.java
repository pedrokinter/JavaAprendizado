package pedro.projetojava.javacore.Bintroduçaometodos.dominioExercicios;

public class Carro014 {
    public String marca;
    public double tanque;
    public double consumo; // km/litro (se for 10, ele percorre 10km usando 1 litro)

    public double abastecer(double litros){
        return tanque += litros;
        // tanque vai receber litros
    }

    public double dirigir(double km){
        return consumo = km / consumo;
        // o consumo vai receber km / consumo, o que significa LITROS GASTOS
    }

    public void sobra() {
        tanque = tanque - consumo; // vai fazer tanque - consumo (litros gastos)
        if (tanque > 0){
            System.out.println("Sobrou no tanque " +tanque+ " Litros de gasolina");
        } else {
            System.out.println("Você nao completou a viagem, pois faltou gasosa. (" +tanque+ ") Litros");
        }
    }
}
