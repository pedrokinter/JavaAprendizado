package pedro.projetojava.javacore.Hherança.exerciciosHeranca;

import pedro.projetojava.javacore.Hherança.dominioExercicio.Animal;
import pedro.projetojava.javacore.Hherança.dominioExercicio.Cachorro;

public class cachorroExercicio {
    public static void main(String[] args) {
        Animal animal = new Animal("Spike", 6);
        Cachorro cachorro = new Cachorro("Spike", 6);

        cachorro.fazerSom();
        System.out.println("-----------");
        animal.fazerSom();
    }
}
