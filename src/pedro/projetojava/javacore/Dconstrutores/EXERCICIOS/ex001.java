package pedro.projetojava.javacore.Dconstrutores.EXERCICIOS;

import pedro.projetojava.javacore.Dconstrutores.dominioExercicios.Carro01;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome do carro, ano e sua velocidade atual: ");
        Carro01 carro = new Carro01(ler.nextLine(), ler.nextLine(), ler.nextDouble());

        System.out.println("--------------------------------------------");

        for (int i = 0; i > -1; i++){
            System.out.println("Você quer acelerar o seu carro de uma maneira fixa ou personalizada? (S p/ sair)");
            String pergunta = ler.nextLine();

            if (pergunta.equals("fixa")){
                System.out.println("O carro acelerou em 10km/h!");
                carro.acelerar();
            } else if (pergunta.equals("personalizada")){
                carro.acelerar(ler.nextDouble());
                System.out.println("Digite a kilometragem!!: ");
                System.out.println("O carro acelerou em " +carro.getTeste()+ " km/h!");

            } else if (pergunta.equals("s")){
                break;
            }
        }

        System.out.println("-----------------------------------------");

        carro.imprimir();
    }
}
