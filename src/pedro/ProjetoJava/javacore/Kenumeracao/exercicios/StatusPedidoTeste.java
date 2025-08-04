package pedro.projetojava.javacore.Kenumeracao.exercicios;

import pedro.projetojava.javacore.Kenumeracao.dominioExercicios.Pedido;
import pedro.projetojava.javacore.Kenumeracao.dominioExercicios.StatusPedido;

import java.util.Scanner;

public class StatusPedidoTeste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Pedido pedido = new Pedido("2134124241", "Livro Nacional", 250);
        boolean emEXECUCAO = false;

        pedido.setStatus(StatusPedido.AGUARDANDO_PAGAMENTO);

        while(true) {
            System.out.println("Quer cancelar a compra?: ");
            String cancela = ler.nextLine();
            if (cancela.equalsIgnoreCase("sim")) {
                pedido.setStatus(StatusPedido.CANCELADO);
                System.out.println("Ok, pedido CANCELADO! ");
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                break;
            }




            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

            System.out.print("Seu pedido está aguardando o pagamento.. Digite o  valor abaixo: R$   ");
            int valorAPagar = ler.nextInt();

            if (valorAPagar == pedido.getValorTotal()) {
                pedido.setStatus(StatusPedido.PROCESSANDO);
                System.out.println(pedido.getStatus());

                System.out.println("Pagamento efetuado com sucesso!");

                System.out.println("=-=-=-=-=-=-=--=-=-=--=");

                System.out.println("Em algumas horas, seu pedido será entregue...");

                pedido.setStatus(StatusPedido.ENVIADO);
                    System.out.println(pedido.getStatus());


                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

                System.out.println("Pedido ENTREGUE com sucesso!");

                    pedido.setStatus(StatusPedido.ENTREGUE);

                System.out.println(pedido);
                break;

            } else if (valorAPagar != pedido.getValorTotal()) {

                System.out.println("Erro, tente novamente!");
                }

        }





    }
}
