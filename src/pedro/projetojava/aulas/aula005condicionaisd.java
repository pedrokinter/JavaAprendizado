package pedro.ProjetoJava.aulas;

public class aula005condicionaisd {
    public static void main(String[] args) {
        String sexo = "M";
        switch (sexo){
            case "M":
                System.out.println("Homem");
                break;
            case "F": {
                System.out.println("Mulher");
                break;
            }
            default:
                System.out.println("invalido");
                break;
        }


    }
}
