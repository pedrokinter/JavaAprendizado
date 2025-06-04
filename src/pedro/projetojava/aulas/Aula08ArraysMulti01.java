package pedro.projetojava.aulas;

public class Aula08ArraysMulti01 {
    public static void main(String[] args) {
        // 1,2,3,4,5 meses
        // 31, 28, 31, 30 dias

        int[][] dias = new int[3][3];
        dias[0][0] = 1;
        dias[0][1] = 2;
        dias[0][2] = 3;

        dias[1][0] = 4;
        dias[1][1] = 5;
        dias[1][2] = 6;

        dias[2][0] = 7;
        dias[2][1] = 8;
        dias[2][2] = 9;

        for (int i = 0; i < dias.length; i++) { // vai ler o tamanho de dias
            for (int j = 0; j < dias[i].length; j++) { // basicamente, tem 2 laços que vao ficar somano e lendo até ter o tamanho de dias
                System.out.println(dias[i][j] + " ");
                // ele vai ler o I e dps ler o length, basicamente 0, ai 0, 1, 2
                // ai dps i = 1, length = 3, logo, 0, 1, 2

                // o i vai ser o primeiro [] e o j vai ser o segundo []
                // e enquanto o FOR do j n acabar, ele n volta pro i.
            }
        }
        // array multidimensional acima

        System.out.println("-------------------------------");

        // aqui simplifica o codigo em cima, porem o for each pega cada uma das posições e cria uma variavel de referencia
        // temporaria pra fazer o trampo
        for (int[] arrBase : dias) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }


    }
}
