package pedro.ProjetoJava.aulas;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int [] numeros = new int [3];
        int [] numeros2 = {1,2,3,4,5};
        // UM ARRAY COM 5 POSIÇÕES E INDICE DE 0 A 4
        // sendo inicializados diretamente com os valores

        int[] numeros3 = new int[]{1,2,3,4,5};
        // mesma coisa da de cima, somente uma forma diferente de inicializar

        for (int num : numeros3){ // isso é uma variavel local.
            System.out.println(num);
        }

        // basicamente imprime a porra toda que ta dentro do array, de 1 até 5, simplificado e rapido, sem calculo
        // porem se eu quiser acessar um indice especifico, melhor usar o for normal (indexado)

    }
}
