package Menu;
import Cardapio.*;
import Pedidos.Pedidos;

import java.util.Scanner;

public class MenuTeste {

    public static void menuTeste(){
        Scanner sc = new Scanner(System.in);

        System.out.println("======================");
        System.out.println("***COMIDA DO GORDÃO***");
        System.out.println("======================");
        System.out.println("|   1 - Lanches      |");
        System.out.println("|   2 - Bebidas      |");
        System.out.println("|   3 - Sobremesas   |");
        System.out.println("|   4 - Porções      |");
        System.out.println("======================");
        String op;
        int i = 0;

        do {
            op = sc.next();
            switch(op) {
                case "1":
                    Lanches.CardapioLanches();
                    i += 1;
                    break;
                case "2":
                    Bebidas.CardapioBebidas();
                    i += 1;
                    break;
                case "3":
                    Sobremesas.CardapioSobremesas();
                    i +=1;
                    break;
                case "4":
                    Porcoes.CardapioPorcoes();
                    i += 1;
                    break;
                default:
                    System.out.print("Opção inválida, digite novamente: ");
                    break;
            }
        } while (i != 1);

        Pedidos pedido = new Pedidos(1000, 1);
    }
}