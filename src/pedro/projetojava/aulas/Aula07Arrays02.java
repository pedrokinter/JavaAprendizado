package pedro.projetojava.aulas;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double == 0
        // char 'u/0000' == ' '
        // boolean == false
        // String == null

        // espaços em memoria e como saem no terminal qnd n tem nada declaraddo
        // exemplo
        String[] nomes = new String[3];
        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);
        // vai retornar null

        String[] personagens = new String[3];
        personagens[0] = "SASUKE";
        personagens[1] = "NARUTO";
        personagens[2] = "GOKU";
        for (int i = 0; i < personagens.length; i++) {
            System.out.println(personagens[i]);
        }
    }
}
