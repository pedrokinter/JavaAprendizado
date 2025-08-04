package pedro.ProjetoJava.javacore.Aintroduçaoclasses.test;

import pedro.ProjetoJava.javacore.Aintroduçaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Pedro";
        professor.idade = 20;
        professor.sexo = 'M';

        System.out.println("NOME: " + professor.nome + " IDADE: " + professor.idade + " SEXO: " + professor.sexo);
    }
}
