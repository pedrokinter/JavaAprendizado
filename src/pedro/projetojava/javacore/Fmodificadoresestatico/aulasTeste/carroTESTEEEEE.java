package pedro.projetojava.javacore.Fmodificadoresestatico.aulasTeste;

import pedro.projetojava.javacore.Fmodificadoresestatico.dominiosAulas.carro;

public class carroTESTEEEEE {
    public static void main(String[] args) {
        carro.setVelocidadeLimite(180);

        carro carro1 = new carro("Bmw", 250);
        carro carro2 = new carro("Porsche",  270);
        carro carro3 = new carro("Lamborghini", 280);



        carro1.imprimir();
        carro2.imprimir();
        carro3.imprimir();


    }
}
