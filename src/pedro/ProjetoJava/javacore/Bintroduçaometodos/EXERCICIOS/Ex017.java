package pedro.ProjetoJava.javacore.Bintroduçaometodos.EXERCICIOS;

import pedro.ProjetoJava.javacore.Bintroduçaometodos.dominioExercicios.Jogador017;

import java.util.Scanner;

public class Ex017 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Jogador017 jogador = new Jogador017();

        System.out.println("DIGITE O NOME DO JOGADOR: ");
        jogador.setNome(entrada.nextLine());

        System.out.println("DIGITE A SUA IDADE");
        jogador.setIdade(entrada.nextInt());

        System.out.println("DIGITE QUANTOS GOLS ELE MARCOU");
        jogador.marcarGol(entrada.nextInt());

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Nome: " +jogador.getNome());
        System.out.println("Idade: " +jogador.getIdade());
        System.out.println("Gols Marcados: " +jogador.getGolsMarcados());

    }
}
