package pedro.projetojava.javacore.Aintroduçaoclasses.test;

import pedro.projetojava.javacore.Aintroduçaoclasses.dominio.Carro;

public class Carro001 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Porsche";
        carro1.modelo = "Porsche 911 GT3 RS";
        carro1.ano = 2024;

        carro2.nome = "HYUNDAI";
        carro2.modelo = "I30 2.0 16V";
        carro2.ano = 2012;

        // sao dois espaços diferentes em memoria, basicamete só isso.

        System.out.println("Carro 1: ");
        System.out.println("NOME: " + carro1.nome + " MODELO: " + carro1.modelo + " ANO: " + carro1.ano);
        System.out.println("Carro 2: ");
        System.out.println("NOME: " + carro2.nome + " MODELO: " + carro2.modelo + " ANO: " + carro2.ano);
    }
}
