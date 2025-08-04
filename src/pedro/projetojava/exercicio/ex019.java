package pedro.ProjetoJava.exercicio;

import java.util.Scanner;

public class ex019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int senhaReal = 1505;
        
        int count = 0;
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-");
        while (count < 3){
            count += 1;
            System.out.println("Digite a sua senha: ");
            int senhaDigitada = scanner.nextInt();
            System.out.println("=-=-=-=-=-=-=");
            int tentativas = 3-count;
            if(senhaDigitada != senhaReal){
                System.out.println("Senha incorreta. Tentativas restantes: " +tentativas);
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-");
                continue;
            }else{
                System.out.println("Senha correta, parabéns!!");
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-");
                break;
            }

        }
    }
}
