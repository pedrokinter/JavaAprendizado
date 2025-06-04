package pedro.projetojava.aulas;

public class Aula08ArraysMulti02 {
    public static void main(String[] args) {
        int [] array = {1,2,3};

        int [] [] matrizInt = new int[4][];

        matrizInt[0] = new int[2];
        matrizInt[1] = new int[4];
        matrizInt[2] = new int[6];
        matrizInt[3] = array;

        int [][] matrizInt2 = {{0,0}, {1,2,3}, {1,2,3,4,5,6}};
        // aq vc cria um array de 2, 3 e 6 posiçoes, mas diretao

        for(int[] matrizBase: matrizInt){
            System.out.println("\n---------");
            for(int valor: matrizBase){
                System.out.print(valor + " ");
            }
            // ele ta criando na posição 0, 2 espaços no array
            // na posiçao 1, 4 espaços
            // na posiçao 2, 6 espaços
            // tudo isso dentro do segundo array lgc


        }
    }
}
