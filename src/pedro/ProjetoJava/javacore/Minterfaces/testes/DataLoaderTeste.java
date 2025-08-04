package pedro.ProjetoJava.javacore.Minterfaces.testes;

import pedro.ProjetoJava.javacore.Minterfaces.dominios.DataBaseLoader;
import pedro.ProjetoJava.javacore.Minterfaces.dominios.FileLoader;

public class DataLoaderTeste {
    public static void main(String[] args) {
        FileLoader fileLoader = new FileLoader();
        DataBaseLoader db = new DataBaseLoader();

        db.load();
        db.remover();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-");

        fileLoader.load();
        fileLoader.remover();
    }
}
