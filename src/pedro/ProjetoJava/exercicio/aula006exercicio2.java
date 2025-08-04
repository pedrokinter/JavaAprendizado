package pedro.ProjetoJava.exercicio;

public class aula006exercicio2 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        // dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // condiçao valorParcela >= 1000
        // preço do carro
        for (double parcela = 1; parcela <= valorTotal; parcela ++){ 
            double valorParcela = valorTotal / parcela; 
            // o valor da parcela é igual ao preço do carro dividido pela parcela (que no começo é 30k dividido por 1, depois vai aumentando as parcelas e consequentemente)
            // dividindo o numero
             if(valorParcela >= 1000){
                System.out.println("Parcela " +parcela+ " R$ " +valorParcela);
                // se o valor da parcela for >= 1000; ele vai printar a parcela (que ta subindo de 1 em 1) e o valor da parcela (que vai dividindo ao mesmo tempo)
                // assim, printando no final as 30 parcelas que você poder pagar(1 parcela de 30 mil, 2 de 15 mil etc)
            }else{
                break;
            }
        }
        
        
        
    }
}
