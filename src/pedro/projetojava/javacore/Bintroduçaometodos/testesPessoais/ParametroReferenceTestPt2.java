package pedro.projetojava.javacore.Bintroduçaometodos.testesPessoais;

import pedro.projetojava.javacore.Bintroduçaometodos.dominiosTestesPessoais.ParametroReferencePt2;

public class ParametroReferenceTestPt2 {
    public static void main(String[] args) {
        ParametroReferencePt2 pessoa =  new ParametroReferencePt2();
        pessoa.nome = "Pedro";
        pessoa.idade = 20;
        // aq eu vou interagir e modificar o valor ORIGINAL, criando uma copia para o local antigo.
        pessoa.modificarNome(pessoa);
        System.out.println("---------------------------");
        pessoa.modificarNome(pessoa);
        // o primeiro modificar nome vai ir com o pedro
        // o segundo vai ir com o joao
        // motivo? simples, eu passei o objeto nome com o nome de joao dentro do metodo
        System.out.println("-------------------");
        pessoa.modificarNome(pessoa);

        // se eu passar dnv vai chamar joao, pois o estado do objeto original foi alterado
        // ele o altera OBJETO dentro do METODO
        // qnd eu altero algo dentro do objeto eu mantenho essa alteração pras outras referencias  q ainda tem ligaçao
        // com esse obj.

    }
}
