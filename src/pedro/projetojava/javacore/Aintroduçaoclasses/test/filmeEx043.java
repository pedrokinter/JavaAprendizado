package pedro.projetojava.javacore.Aintroduçaoclasses.test;

import pedro.projetojava.javacore.Aintroduçaoclasses.dominio.Filme;

public class filmeEx043 {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.nome = "Vingadores";
        filme.ano = 2012;
        filme.genero = "Ação";

        System.out.println(filme.nome + " (" + filme.ano + ") " + " - " + "Gênero: " + filme.genero);

    }
}
