package pedro.ProjetoJava.javacore.Lclassesabstratas.dominiosExercicios;

public class ProcessadorCSV extends ProcessadorDeArquivo {
    public ProcessadorCSV(String nome, String idade, String cidade) {
        super(nome, idade, cidade);
    }

    public void lerArquivo() {
        System.out.println("Nome,Idade,Cidade");
        System.out.println(getNome() + "," + getIdade() + "," + getCidade());
    }

    public void processarConteudo(){
        System.out.println("Nome: "+getNome());
        System.out.println("Idade: "+getIdade());
        System.out.println("Cidade: "+getCidade());
    }
}
