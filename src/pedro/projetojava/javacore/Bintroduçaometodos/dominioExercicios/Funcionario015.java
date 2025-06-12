package pedro.projetojava.javacore.Bintroduçaometodos.dominioExercicios;

import java.util.Arrays;

public class Funcionario015 {
    public String nome;
    public int idade;
    public double [] salarios;

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
        double media = 0;
        for (double nums : salarios) {
            media += nums;
        }
        media /= salarios.length;
        System.out.println("A média salarial desse funcionário é igual a " + media);
    }


}
