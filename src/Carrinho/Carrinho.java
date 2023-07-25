package Carrinho;
import java.util.Scanner;
import Pedidos.Pedidos;
import Menu.MenuTeste;

public class Carrinho {
  
    static int count = 0;
    static float total = 0;

    public static void carrinho() {

        MenuTeste menuTeste = new MenuTeste();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nVocê deseja continuar a compra?");
        String r1 = sc.nextLine();
        
        if (r1.equalsIgnoreCase("S")){
            total = Pedidos.getSubTotal() + total;
            count++;
            menuTeste.menuTeste();

        } else if (r1.equalsIgnoreCase("N") && count == 0){
            System.out.println("O valor total do seu pedido é: R$" + Pedidos.getSubTotal());
        } else if (r1.equalsIgnoreCase("N") && count != 0){
            total = Pedidos.getSubTotal() + total;
            System.out.println("O valor total do seu pedido é: R$" + total);
        }
    }
}
