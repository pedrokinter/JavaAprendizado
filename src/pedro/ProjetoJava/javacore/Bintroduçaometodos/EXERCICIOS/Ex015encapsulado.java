package pedro.ProjetoJava.javacore.Bintroduçaometodos.EXERCICIOS;

import pedro.ProjetoJava.javacore.Bintroduçaometodos.dominioExercicios.Funcionario015;

import java.util.Scanner;

public class Ex015encapsulado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Funcionario015 funcionario1 = new Funcionario015();

        System.out.println("Digite os dados do primeiro funcionario (Nome, Idade e Salário respectivamente): ");
        funcionario1.setNome(entrada.next());
        funcionario1.setIdade(entrada.nextInt());
        funcionario1.salarios = new double[3];

        for (int i = 0; i < 3; i++) {
            funcionario1.salarios[i] = entrada.nextInt();
        }
        funcionario1.imprimir();
        System.out.println("=-=-=-=-=-=-=-=-=");
        funcionario1.tirarMedia();
        System.out.println("-------------------");
        System.out.println(funcionario1.getMedia()); // so da pra pegar a media por aq agora, pela impresaso



    }
}
