package pedro.ProjetoJava.aulas;

public class aula005 {
    public static void main(String[] args) {
        int idade = 18;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if(isAutorizadoComprarBebida) {
            System.out.println("tu pode comprar alcool");
        }else{
            System.out.println("pode comprar alcol nao parcero");

            // if e else tem que estar desse jeito para estarem certos;
            // o  metodo só com o if é independente, usado para certas situações;
        }

        if (!isAutorizadoComprarBebida){ 
            System.out.println("Não autorizado a comprar alcool");
        }
        // isso ! e == false no final sao a mesma coisa, basicamente ta falando que se a idade for diferente de 18 pra cima tu nao ta autorizado
        // if "not" ou se não
        




        else {
            System.out.println("tu nao pode comprar alcool");
    
        }
    }
}
