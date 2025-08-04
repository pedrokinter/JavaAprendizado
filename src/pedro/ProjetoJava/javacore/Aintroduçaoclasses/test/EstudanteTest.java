package pedro.ProjetoJava.javacore.Aintroduçaoclasses.test;

import pedro.ProjetoJava.javacore.Aintroduçaoclasses.dominio.Estudante;
public class EstudanteTest {
    // essa classe sempre vai ser usada pra testar o objeto pessoa que está na pasta dominio
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        // uma variavel de referencia do tipo estudante (Estudante estudante)
        // e um objeto do tipo estudante (new Estudante())
        estudante.nome = "Pedro";
        estudante.idade = 17;
        estudante.sexo = 'H';
        // o estudante é variavel de referencia
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
