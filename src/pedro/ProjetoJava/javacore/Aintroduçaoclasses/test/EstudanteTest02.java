package pedro.ProjetoJava.javacore.Aintroduçaoclasses.test;

import pedro.ProjetoJava.javacore.Aintroduçaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "Pedro";
        System.out.println(estudante.idade);
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println("=================");

        estudante2.nome = "I name";
        System.out.println(estudante2.idade);
        System.out.println(estudante2.nome);
        System.out.println(estudante2.sexo);
    }
}
