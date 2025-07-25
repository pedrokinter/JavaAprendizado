package pedro.projetojava.javacore.Jmodificadorfinal.exercicios;

import pedro.projetojava.javacore.Jmodificadorfinal.dominio.ContaBancaria;

public class contaTeste {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(120);

        conta.setTitular("Pedro");
        conta.setSaldo(1000);

        //conta.numeroConta = 180; // da erro, pois é final

        conta.depositar(100);
        conta.sacar(50);
        System.out.println(conta.getTitular());
        System.out.println(conta.getSaldo());
    }
}
