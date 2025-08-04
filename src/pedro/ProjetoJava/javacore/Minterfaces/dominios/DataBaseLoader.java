package pedro.projetojava.javacore.Minterfaces.dominios;

public class DataBaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Loading DataBase...");
    }

    @Override
    public void remover() {
        System.out.println("Removing DataBase...");
    }
}
