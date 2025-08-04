package pedro.projetojava.javacore.Jmodificadorfinal.exercicios;

import pedro.projetojava.javacore.Jmodificadorfinal.dominio.CarroExercicio;
import pedro.projetojava.javacore.Jmodificadorfinal.dominio.VeiculoExercicio;

public class veiculoTeste {
    public static void main(String[] args) {
        VeiculoExercicio veiculo = new VeiculoExercicio("BMW", "X6");
        CarroExercicio carro = new CarroExercicio("BMW", "X6", 10);


        System.out.println(carro);
    }
}
