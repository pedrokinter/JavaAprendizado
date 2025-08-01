package pedro.projetojava.javacore.Lclassesabstratas.exercicios;

import pedro.projetojava.javacore.Lclassesabstratas.dominiosExercicios.Animal;
import pedro.projetojava.javacore.Lclassesabstratas.dominiosExercicios.Cachorro;
import pedro.projetojava.javacore.Lclassesabstratas.dominiosExercicios.Gato;

public class AnimaisTestes {
    public static void main(String[] args) {
        Animal gato = new Gato("Faisca");
        gato.mostrarNome();
        gato.emitirSom();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=");
        Cachorro cachorro = new Cachorro("Scooby");
        cachorro.mostrarNome();
        cachorro.emitirSom();


    }
}
