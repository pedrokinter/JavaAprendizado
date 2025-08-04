package pedro.ProjetoJava.javacore.Bintroduçaometodos.EXERCICIOS;

import pedro.ProjetoJava.javacore.Bintroduçaometodos.dominioExercicios.Lampada009;

import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Lampada009 lampada = new Lampada009();

        System.out.println("Você quer ligar a lâmpada? [S/N]");
        String opcao = entrada.nextLine();
        if (opcao.equals("S")) {
            lampada.ligarALampada();
        } else if (opcao.equals("N")) {
            System.out.println("Ok, encerrando programa");
        }


        System.out.println("Digite a potência da sua lampada: ");
        lampada.potencia = entrada.nextInt(); //watts

        System.out.println("Digite quanto tempo ela vai ficar ligada: ");
        int horas = entrada.nextInt();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=");

        lampada.usar(horas);
        lampada.mostrarStatus();

        System.out.println("Você quer desligar a lâmpada? [S/N]");
        String opcaoDesliga = entrada.next();
        if (opcaoDesliga.equals("S") || opcaoDesliga.equals("s")) {
            System.out.println("Ok, encerrando programa..");
            lampada.desligarLampada();
        } else if (opcaoDesliga.equals("N") || opcaoDesliga.equals("n")) {
            System.out.println("Por quanto tempo a mais você quer manter a lampada? ");

        }


        System.out.println("=-=-=-=-=-=-=-=-=-=-=");

    }
}
