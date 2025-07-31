package pedro.projetojava.javacore.Lclassesabstratas.exercicios;

import pedro.projetojava.javacore.Lclassesabstratas.dominiosExercicios.ProcessadorCSV;
import pedro.projetojava.javacore.Lclassesabstratas.dominiosExercicios.ProcessadorJSON;

import java.util.Scanner;

public class processadorTeste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome, idade e sua cidade para serem colocados em um arquivo CSV e JSON");


        System.out.println("Nome: ");
        String nome = entrada.nextLine();

        System.out.println("Idade: ");
        String idade = entrada.nextLine();

        System.out.println("Cidade: ");
        String cidade = entrada.nextLine();

        ProcessadorCSV CSV = new ProcessadorCSV(nome, idade, cidade);
        ProcessadorJSON JSON = new ProcessadorJSON(nome, idade, cidade);
        System.out.println("=-=--=-=-=-=-=-=-==-=-=");
        CSV.executar();
        System.out.println("=-=--=-=-=-=-=-=-==-=-=");
        JSON.executar();
    }
}
