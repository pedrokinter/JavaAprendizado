public class switchrevisao {
    public static void main(String[] args) {
        byte dia = 5;
        switch (dia) {
            case 1:
            System.out.println("Domingo");
            break;
            case 2:
            System.out.println("seg");
            break;
            case 3:
            System.out.println("ter");
            break;
            case 4:
            System.out.println("qua");
            break;
            case 5:
            System.out.println("qui");
            break;
            case 6:
            System.out.println("sex");
            break;
            case 7:
            System.out.println("sab");
            break;
            default: 
            System.out.println("opçao invalida");
            break;
            // usa esse pra parar, caso nenhum dos case seja executado
            // não precisa estar em ultimo
        }
    }
}
