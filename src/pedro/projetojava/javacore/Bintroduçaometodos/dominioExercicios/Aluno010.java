package pedro.ProjetoJava.javacore.Bintroduçaometodos.dominioExercicios;

public class Aluno010 {
    public String nome;
    public double nota;

    public void melhorNota(Aluno010 aluno, Aluno010 aluno2) {
        if (aluno2.nota > this.nota){
            System.out.println(aluno2.nome + " tem a maior nota que " + this.nome);
            System.out.println("Sendo ela igual a : " +aluno2.nota);
        } else {
            System.out.println(aluno.nome + " tem maior nota que " + aluno2.nome);
            System.out.println("Sendo ela igual a : " +this.nota);
        }
        // aq funciona mas ele quer q eu retorne, nao imprima, pq assim n precisa nem botar nada dentro do metodo
    }

    public double alunoMelhorNota(Aluno010 aluno, Aluno010 aluno2) {
        if (this.nota > aluno2.nota){
            return aluno.nota;
        } else {
            return aluno2.nota;
        }
    }

    //public void alunoTeste(Aluno010 aluno1, Aluno010 aluno2) {
        //int maior = Math.max(aluno1.nota, aluno2.nota);
        //if (maior == aluno1.nota){
            //System.out.println("oi");
        /// else {
            //System.out.println("tcvhau");
        //}
    //}
}


