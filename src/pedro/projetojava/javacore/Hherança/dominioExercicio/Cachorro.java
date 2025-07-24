package pedro.projetojava.javacore.Hherança.dominioExercicio;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    public void fazerSom() {
        System.out.println("O cachorro late");
    }


}
