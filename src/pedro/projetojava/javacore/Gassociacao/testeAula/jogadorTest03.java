package pedro.projetojava.javacore.Gassociacao.testeAula;


import pedro.projetojava.javacore.Gassociacao.dominio.Jogador2;

import pedro.projetojava.javacore.Gassociacao.dominio.Time2;

public class jogadorTest03 {
    public static void main(String[] args) {
        Jogador2 jogador = new Jogador2("Malcom");
        Jogador2 jogador2 = new Jogador2("Marcos Leonardo");

        Time2 time = new Time2("Al-Hilal");

        Jogador2[] jogadores = {jogador, jogador2}; // array d 1 posiçao


        jogador.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores); // array


        System.out.println("--- jogador --- ");
        jogador.imprime();

        System.out.println("--- time ---");
        time.imprimir();
    }
}
