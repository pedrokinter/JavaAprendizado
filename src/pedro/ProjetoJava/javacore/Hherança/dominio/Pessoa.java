package pedro.ProjetoJava.javacore.Hherança.dominio;

public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;

    static {
        System.out.println("Dentro do bloco de inicializaççao estatico de pessoa");
    }
    {
        System.out.println("Dentro do bloco de inicializaççao estatico de pessoa 1 ");

    }
    {
        System.out.println("Dentro do bloco de inicializaççao estatico de pessoa 2 ");

    }


    public Pessoa(String nome){
        this.nome = nome;
    }




    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Rua: " +this.endereco.getRua() + " Cep: " + this.endereco.getCep());
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
