package pedro.ProjetoJava.exercicio;

import java.util.Scanner;

public class ex013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A seguir, digite dois números, que serão escritos do maior para o menor: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int cont = 0;
        int sub = 0;

        System.out.println("-------------");
        System.out.println("Segue em baixo a lista do maior para o menor dos números " +n1+ " e " +n2);
        while(n1 >= n2 || n2 >= n1){
            cont += 1;
            if(n2 > n1){
                
                sub = n2 - cont;
            }else{
                sub = n1 - cont;
            }
            System.out.println(sub);
            if(sub == n2 || sub == n1){
                break;
            }
            

        }
        System.out.println("-------------");
    }
}
