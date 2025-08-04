package pedro.ProjetoJava.javacore.Jmodificadorfinal.teste;

import pedro.ProjetoJava.javacore.Jmodificadorfinal.dominio.Carro;
import pedro.ProjetoJava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Ferrari ferrari = new Ferrari();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.comprador);
        carro.comprador.setNome("pires");
        System.out.println(carro.comprador);

        ferrari.setNome("henrique");
        ferrari.imprimir();
    }
}
