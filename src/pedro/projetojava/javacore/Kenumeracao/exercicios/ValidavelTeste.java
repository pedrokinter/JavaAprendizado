package pedro.projetojava.javacore.Kenumeracao.exercicios;

import pedro.projetojava.javacore.Kenumeracao.dominioExercicios.TipoCampo;

public class ValidavelTeste {
    public static void main(String[] args) {


        System.out.println(TipoCampo.EMAIL.validar("pedro@gmail.com"));
        System.out.println(TipoCampo.CPF.validar("111.111.111-58"));
        System.out.println(TipoCampo.TELEFONE.validar("91111-9999"));
    }
}
