package pedro.ProjetoJava.aulas;

public class aula006repeticaoc {
    public static void main(String[] args) {
        double valorTotal = 30000;

        for (int parcela = (int) valorTotal; parcela >= 1; parcela --){ 
            // a parcela é igual a 30k, e tem que ser maior ou igual a 1, e ela vai subtraindo de 1 em 1
            double valorParcela = valorTotal / parcela; 
            // aqui é a variavel do valor da parcela, que vai ser igual a 30k dividindo pela parcela (que vai começar em 30k e ir abaixando de 1 em 1)
             if(valorParcela < 1000){
                continue;
                // se o valor da parcela for menor do que 1000, ele vai continuar dividindo e fodase, sem printar nada
            }
            System.out.println("Parcela " +parcela+ " R$ " +valorParcela);
                // porem, se for maior do que 1000, ele vai começar a printar
        }
        
        
        
    }
}
