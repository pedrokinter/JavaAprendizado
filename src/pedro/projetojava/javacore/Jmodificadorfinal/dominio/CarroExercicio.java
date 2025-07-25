package pedro.projetojava.javacore.Jmodificadorfinal.dominio;

public class CarroExercicio extends VeiculoExercicio{
        private int portas;

    public CarroExercicio(String marca, String modelo, int portas) {
        super(marca, modelo);
        this.portas = portas;
    }


    @Override
    public String toString() {
        return "Marca: " +getMarca()+ " Modelo: " +getModelo()+ " Portas do Carro: " + this.portas
                ;
    }

    //public void ligarMotor(){
        //System.out.println("Ligando motor...");
    //} // da erro.

    public void ligarPainel() {
        System.out.println("Ligando painel");
    }
}
