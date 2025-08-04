package pedro.ProjetoJava.javacore.Lclassesabstratas.exercicios;

import pedro.ProjetoJava.javacore.Lclassesabstratas.dominiosExercicios.ProcessadorCSV;
import pedro.ProjetoJava.javacore.Lclassesabstratas.dominiosExercicios.ProcessadorDeArquivo;
import pedro.ProjetoJava.javacore.Lclassesabstratas.dominiosExercicios.ProcessadorJSON;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class processadorTeste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome, idade e sua cidade para serem colocados em um arquivo CSV e JSON");

        List<ProcessadorDeArquivo> arquivos = new ArrayList<ProcessadorDeArquivo>();

        System.out.println("Nome: ");
        String nome = entrada.nextLine();

        System.out.println("Idade: ");
        String idade = entrada.nextLine();

        System.out.println("Cidade: ");
        String cidade = entrada.nextLine();

        ProcessadorCSV csv = new ProcessadorCSV(nome, idade, cidade);
        ProcessadorJSON json = new ProcessadorJSON(nome, idade, cidade);
        
        arquivos.add(csv);
        arquivos.add(json);

        for (ProcessadorDeArquivo arquivo : arquivos) {
            arquivo.executar();
        }
    }
}
