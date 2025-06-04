package pedro.projetojava.exercicio;

public class aula005exercicio2 {
    public static void main(String[] args) {
        // dados os valores de 1 a 7, imprima se é dia util ou final de semana
        // considerando 1 como domingo

        int dia = 4;
        switch (dia){
            case 1:
                System.out.println("DOMINGO");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("SABADO");
                break;
            default:
                System.out.println("opçao invalida");
                break;
        }
        if(dia == 1 || dia == 7){
            System.out.println("é um final de semana");
        }else{
            System.out.println("é um dia útil");
        }


    byte dia2 = 6;
    switch(dia2){
        case 1:
        case 7:
            System.out.println("fds");
            break;
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
            System.out.println("dia util");
            break;
        default:
            System.out.println("opçao invalida");
        break;

        //versao que ele fez, menos codigo, mas eu nao sabia q n era par botar os dias.
        }
    }
}



