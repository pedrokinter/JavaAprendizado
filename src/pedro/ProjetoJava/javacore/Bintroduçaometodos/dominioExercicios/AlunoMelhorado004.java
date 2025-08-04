package pedro.ProjetoJava.javacore.Bintroduçaometodos.dominioExercicios;

public class AlunoMelhorado004 {
    public String nome;
    public int [] notas;
    public int qntdNotas;
    public int contador;

    public int mediaFinal() {
        for (int i = 0; i < notas.length; i++) {
            contador += notas[i];
        }
        return contador / notas.length;
    }
}
