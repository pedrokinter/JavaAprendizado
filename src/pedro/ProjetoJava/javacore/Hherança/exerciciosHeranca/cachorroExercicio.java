package pedro.ProjetoJava.javacore.Hherança.exerciciosHeranca;

import pedro.ProjetoJava.javacore.Hherança.dominioExercicio.Animal;
import pedro.ProjetoJava.javacore.Hherança.dominioExercicio.Cachorro;

public class cachorroExercicio {
    public static void main(String[] args) {
        Animal animal = new Animal("Spike", 6);
        Cachorro cachorro = new Cachorro("Spike", 6);

        Animal rex = new Cachorro("rex", 9);

        cachorro.fazerSom();
        System.out.println("-----------");
        animal.fazerSom();
        System.out.println("------------");
        rex.fazerSom(); // <-- chama o metodo cachorro, mostrando o polimorfismo em açao
    }
}
