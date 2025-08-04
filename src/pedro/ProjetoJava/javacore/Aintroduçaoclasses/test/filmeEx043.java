package pedro.ProjetoJava.javacore.Aintroduçaoclasses.test;

import pedro.ProjetoJava.javacore.Aintroduçaoclasses.dominio.Filme;

public class filmeEx043 {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.nome = "Vingadores";
        filme.ano = 2012;
        filme.genero = "Ação";

        System.out.println(filme.nome + " (" + filme.ano + ") " + " - " + "Gênero: " + filme.genero);

    }
}
