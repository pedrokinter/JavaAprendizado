package pedro.projetojava.javacore.Bintroduçaometodos.dominioExercicios;

import java.util.Arrays;

public class Alunozao019 {
    private String nome;
    private String matricula;
    private double [] notas = new double[3];
    int teste = 0;

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Notas: " + Arrays.toString(this.notas));
    }

    public void adicionarNota(double nota){

        if (teste < notas.length){
            this.notas[teste] = nota;
            teste++;
        } else {
            System.out.println("erro, todas as notas ja foram inseridas.");
        } // jeito eficiente q o gpt fez

        //for(int i=0; i<notas.length; i++){
            //this.notas[teste] = nota;
        //}
        //teste++;

         // jeito podi q eu fiz
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }


    public double getMedia(){
        double media = 0;
        for(int i=0; i<3; i++){
            media += this.notas[i];
        }
        media /= 3;
        return media;
    }

    public String getSituacao () {
        if (getMedia() >= 7){
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

}
