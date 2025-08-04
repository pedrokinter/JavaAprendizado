package pedro.ProjetoJava.javacore.Bintroduçaometodos.testesPessoais;

import pedro.ProjetoJava.javacore.Bintroduçaometodos.dominiosTestesPessoais.ImpressoraReference;
import pedro.ProjetoJava.javacore.Bintroduçaometodos.dominiosTestesPessoais.ParametroReference;

public class ParametroReferenceTest {
    public static void main(String[] args) {
        ParametroReference pessoa = new ParametroReference();
        ParametroReference pessoa2 = new ParametroReference();
        ImpressoraReference impressoraFora = new ImpressoraReference();
        //ParametroReference impressoraDentroDoParametro = new ParametroReference();
        pessoa.nome = "Pedro";
        pessoa.idade = 20;
        pessoa.sexo = 'H';

        pessoa2.nome = "milena";
        pessoa2.idade = 19;
        pessoa2.sexo = 'M';
        // aq eu faço um banco de dados com os nome idade etc

        System.out.println("--------------------");
        //impressoraDentroDoParametro.imprimirTeste(pessoa);
        //impressoraDentroDoParametro.imprimirTeste(pessoa2);
        System.out.println("===========================");
        impressoraFora.imprimirNomes(pessoa);
        impressoraFora.imprimirNomes(pessoa2);
        // e aq o objeto "impressoraFora" da classe "ImpressoraReference" vai usar o metodo "imprimirNomes" pra
        // dar saida no q estiver la

        // a questao é q esse metodo ta fazendo referencia ao objeto "Pessoa" da classe "ParametroReference"
        // entao, o metodo imprimirNomes pode dar saida numa boa o objeto pessoa, pq eu estou referenciando ele
        // to referenciando onde ele ta guardado, basicamente uma copia.


    }
}
