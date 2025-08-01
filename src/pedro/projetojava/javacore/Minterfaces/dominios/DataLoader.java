package pedro.projetojava.javacore.Minterfaces.dominios;

public interface DataLoader {
    void load();
    default void checkPermission(){
        System.out.println("Checking permission");
    }
}
