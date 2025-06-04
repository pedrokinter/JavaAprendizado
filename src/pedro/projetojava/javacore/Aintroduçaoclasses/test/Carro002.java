package pedro.projetojava.javacore.Aintroduçaoclasses.test;

import pedro.projetojava.javacore.Aintroduçaoclasses.dominio.Carro;

public class Carro002 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "HYUNDAI";
        carro.modelo = "I30 2.0 16V";
        carro.ano = 2012;

        System.out.println("NOME: " + carro.nome + " MODELO: " + carro.modelo + " ANO: " + carro.ano);
    }
}
