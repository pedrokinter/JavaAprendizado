package pedro.projetojava.javacore.Bintroduçaometodos.dominiosTestesPessoais;

import pedro.projetojava.javacore.Bintroduçaometodos.dominioExercicios.Retangulo011;

public class RetanguloRefeito {
    public double largura;
    public double altura;


    public double area() {
        return this.altura * this.largura;
    }

    public double perimetro() {
        return 2 * (this.altura + this.largura);

    }

    public boolean mArea(RetanguloRefeito retangulo) {
        return this.area() > retangulo.area();
        // this.area chama o metodo area do objeto que chamou o metodo mArea (r1)
        // retangulo.area chama o metodo area do objeto passado como argumento (retangulo q é r2)

        // dps tem uma comparaçao, que se nao for igual a essa acima vai ser false, ai eu printo la q r2 > r1
    }
}
