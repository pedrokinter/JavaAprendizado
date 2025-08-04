package pedro.ProjetoJava.exercicio;

import java.time.LocalDate;
import java.util.Scanner;

public class ex014 {
    public static void main(String[] args) {
        Scanner perg = new Scanner(System.in);
        LocalDate dataAtual = LocalDate.now();

        String data = "1 - Mostrar data atual";
        String ola = "2 - Dizer olá";
        String sair = "3 - Sair";
        System.out.println("ESCOLHA UMA OPÇÃO: ");
        System.out.println(data);
        System.out.println(ola);
        System.out.println(sair);


        int pergunta = perg.nextInt();

        switch (pergunta) {
            case 1: 
            System.out.println(dataAtual);
            break;
            case 2:
            System.out.println("Olá, tudo bem?");
            break;
            case 3:
            System.out.println("Saindo do programa, até logo...");
            break;
            default:
            System.out.println("Número inválido, tente novamente.");
            break;
            
        }        
        



        
     }
}
