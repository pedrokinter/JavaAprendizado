package pedro.ProjetoJava.javacore.Bintroduçaometodos.dominioExercicios;

import java.util.Arrays;

public class Funcionario015 {
    private String nome;
    private int idade;
    public double [] salarios;
    private double media;

    public void imprimir(){
        if (salarios == null){
            return; // se o salario n for digitado, ele nem começa o metodo
        }
        System.out.println("Nome: " + this.nome+ ", Idade: " + this.idade + ", Salários: " + Arrays.toString(salarios));
    }

    public void tirarMedia() {
        if (salarios == null){
            return;
        }

        for (double nums : salarios) {
            media += nums;
        }
        media /= salarios.length;
        System.out.println("A média salarial desse funcionário é igual a " + media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}
