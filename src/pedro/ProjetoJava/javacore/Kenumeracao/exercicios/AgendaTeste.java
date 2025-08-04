package pedro.ProjetoJava.javacore.Kenumeracao.exercicios;

import pedro.ProjetoJava.javacore.Kenumeracao.dominioExercicios.Agenda;
import pedro.ProjetoJava.javacore.Kenumeracao.dominioExercicios.DiasDaSemana;

import java.util.Scanner;

public class AgendaTeste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual é o dia da semana hoje?: ");
        String dia = ler.nextLine();

        DiasDaSemana diaTeste = DiasDaSemana.buscarPorNome(dia);

        Agenda agenda = new Agenda(diaTeste);

        agenda.imprimirDia();
    }
}
