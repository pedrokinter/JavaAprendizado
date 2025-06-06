package pedro.projetojava.javacore.Bintroduçaometodos.EXERCICIOS;

import pedro.projetojava.javacore.Bintroduçaometodos.dominioExercicios.Lampada009;

import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Lampada009 lampada = new Lampada009();


        System.out.println("Digite a potência da sua lampada: ");
        lampada.potencia = entrada.nextInt(); //watts

        System.out.println("Digite quanto tempo ela vai ficar ligada: ");
        int horas = entrada.nextInt();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=");

        lampada.ligar();
        lampada.usar(horas);
        lampada.mostrarStatus();
        lampada.desligar();



    }
}
