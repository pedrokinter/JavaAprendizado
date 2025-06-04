package pedro.projetojava.aulas;

public class aula006repeticao {
    public static void main(String[] args) {
        // while, do while, for
        
        int count = 0;
        while (count < 10){
            count += 1;
            System.out.println(count); //pode ser (++count) tb
        }
        do {
            System.out.println("dentro do do-while");
        } while (count < 10);


        for(int i=0;  i<10;   i++){ //para i começando de 0, até o i ser menor do que 10, adicionando ele de 1 em 1, faça:
            System.out.println("for "+i);
        }
    }
}
