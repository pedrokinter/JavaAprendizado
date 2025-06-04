package pedro.projetojava.javacore.Bintroduçaometodos.dominioExercicios;

public class Carro005 {
    public String modelo;
    public int consumo; // (km/litro) se for 10, entao ele percorrera 10km com 1 litro
    public int distancia; // km

    public int litrosGastos () {
        return distancia / consumo;
    }

}
