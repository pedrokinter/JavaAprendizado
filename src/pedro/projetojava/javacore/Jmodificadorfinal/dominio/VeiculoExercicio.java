package pedro.ProjetoJava.javacore.Jmodificadorfinal.dominio;

public class VeiculoExercicio {
    private String marca;
    private String modelo;

    public VeiculoExercicio(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public final void ligarMotor(){
        System.out.println("Motor Ligado");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
