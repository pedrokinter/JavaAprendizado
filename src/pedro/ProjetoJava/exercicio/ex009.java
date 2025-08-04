package pedro.ProjetoJava.exercicio;

import java.util.Scanner;

public class ex009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos pedir sua idade, sua nacionalidade e iremos dizer suas informações");
        System.out.println("Digite a idade: ");
        int idade = scanner.nextInt();
        System.out.println("Você é brasileiro? (sim/não)");
        String pais = scanner.next();
        scanner.close();
        if(pais.equals("nao")){
            System.out.println("Não é eleitor do brasil.");
        }else if(pais.equals("sim") && idade < 16){
          System.out.println("Você não pode votar, pois é menor de 16 anos");  
        }else if(pais.equals("sim") && idade >= 16 && idade < 18 || idade >= 70){
            System.out.println("Voto Opcional;");
        }else{
            System.out.println("Voto Obrigatório");
        }
    }
}
