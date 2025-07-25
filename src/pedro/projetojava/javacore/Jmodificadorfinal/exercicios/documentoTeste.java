package pedro.projetojava.javacore.Jmodificadorfinal.exercicios;

import pedro.projetojava.javacore.Jmodificadorfinal.dominio.Contrato;
import pedro.projetojava.javacore.Jmodificadorfinal.dominio.DocumentoExercicio;

public class documentoTeste {
    public static void main(String[] args) {
        DocumentoExercicio documento = new DocumentoExercicio();
        Contrato contrato = new Contrato();

        documento.setTitulo("noites brancas");
        documento.setAutor("dostoievski");

        documento.imprimir();
        System.out.println("---------------------------------");
        contrato.imprimir();
        System.out.println("--------------------------");
        contrato.exibirDetalhes();

    }
}
