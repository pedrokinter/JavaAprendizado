package pedro.ProjetoJava.javacore.Lclassesabstratas.dominiosExercicios;

public abstract class ProcessadorDeArquivo {
    private String nome;
    private String idade;
    private String cidade;

    public ProcessadorDeArquivo(String nome, String idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    public abstract void lerArquivo();

    public abstract void processarConteudo();

    public void executar() {
        lerArquivo();
        System.out.println("=-=--=-=-=-=-=-=-=-=-=-=");
        processarConteudo();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
