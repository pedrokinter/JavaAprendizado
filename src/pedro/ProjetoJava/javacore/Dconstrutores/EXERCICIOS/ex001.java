package pedro.projetojava.javacore.Dconstrutores.EXERCICIOS;

import pedro.projetojava.javacore.Dconstrutores.dominioExercicios.Carro01;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome do carro, ano e sua velocidade atual: ");
        Carro01 carro = new Carro01(ler.nextLine(), ler.nextLine(), ler.nextDouble());

        ler.nextLine();

        System.out.println("--------------------------------------------");

        while(true){
            System.out.println("Você quer acelerar o seu carro de uma maneira fixa ou personalizada? (S p/ sair)");
            String pergunta = ler.nextLine();

            if (pergunta.equals("fixa")){
                System.out.println("O carro acelerou em 10km/h!");
                carro.acelerar();
            } else if (pergunta.equals("personalizada")){
                System.out.println("Digite a kilometragem!!: ");
                double valor = ler.nextDouble();
                carro.acelerar(valor);
                System.out.println("O carro acelerou em " +valor+ " km/h!");

            } else if (pergunta.equals("s")){
                break;
            }
        }

        System.out.println("-----------------------------------------");

        carro.imprimir();
    }
}
