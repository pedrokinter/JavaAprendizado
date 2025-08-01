package pedro.projetojava.javacore.Lclassesabstratas.dominiosExercicios;

public class ProcessadorJSON extends ProcessadorDeArquivo{
    public ProcessadorJSON(String nome, String idade, String cidade) {
        super(nome, idade, cidade);
    }

    @Override
    public void lerArquivo() {
        System.out.println("{ nome:" + "  " + getNome());
        System.out.println("idade:" + "  " + getIdade());
        System.out.println("cidade:" + "  " +  getCidade() +" }");
    }

    @Override
    public void processarConteudo() {
        System.out.println("{ nome:" + "  " + getNome());
        System.out.println("idade:" + "  " + getIdade() + " }");
    }
}
