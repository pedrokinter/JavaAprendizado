package pedro.projetojava.javacore.Lclassesabstratas.dominiosExercicios;

public abstract class ProcessadorDeArquivo {
    public abstract void lerArquivo();

    public abstract void processarConteudo();

    public void executar() {
        lerArquivo();
        processarConteudo();
    }
}
