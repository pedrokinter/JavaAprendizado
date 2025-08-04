package pedro.ProjetoJava.javacore.Gassociacao.dominio;

import java.util.Arrays;

public class seminarioAula {
    private String[] titulo = new String[2];
    private estudantesAula estudantes;
    private localAula local;
    private int tamanho = 0;

    public void exibir() {
        System.out.println(Arrays.toString(titulo));
    }


    public void add(String valor){
        if (tamanho == titulo.length){
            String[] array = new String[titulo.length + 2];
            for (int i = 0; i < titulo.length; i++) {
                array[i] = titulo[i];
            }
            titulo = array;
        }
        titulo[tamanho] = valor;
        tamanho++; // o tamanho sempre vai auemntar, pois ele so dobra o array dps q ele bate fica igual ao array atual
    }




    public String[] getTitulo() {
        return titulo;
    }

    public void setTitulo(String[] titulo) {
        this.titulo = titulo;
    }

    public estudantesAula getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(estudantesAula estudantes) {
        this.estudantes = estudantes;
    }

    public localAula getLocal() {
        return local;
    }

    public void setLocal(localAula local) {
        this.local = local;
    }
}
