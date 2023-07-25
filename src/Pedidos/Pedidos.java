package Pedidos;
import Cardapio.*;
import java.util.Scanner;

public class Pedidos {
    Scanner sc = new Scanner(System.in);
    public int escolha;

    public void pedidoCliente() {
        System.out.print("Escolha o produto que deseja adicionar ao carrinho, pelo ID: ");
        int idProduto = sc.nextInt();

        System.out.print("\nAgora digite a quantidade que deseja adicionar: ");
        int qtd = sc.nextInt();

        float valorUnitario = calculoValor(idProduto, qtd);
        float subTotal = qtd * valorUnitario;
        System.out.format("Subtotal: R$%.2f", subTotal);
    }

    private int idProduto;
    private int qtd;

    public Pedidos(int idProduto, int qtd) {
        this.idProduto = idProduto;
        this.qtd = qtd;
        pedidoCliente();
    }

    public static float calculoValor(int idProduto, int qtd) {
        switch(idProduto) {
            case 1000:
                return 12.5f;
            case 1001:
                return 14.5f;
            case 1002:
                return 15f;
            case 1003:
                return 16f;
            case 1004:
                return 21.5f;
            case 1005:
                return 10f;
            case 1006:
                return 5f;
            case 1007:
                return 8f;
            case 1008:
                return 4.5f;
            case 1009:
                return 12f;
            case 1010:
                return 6f;
            case 1011:
                return 10f;
            case 1012:
                return 8.5f;
            case 1013:
                return 9.5f;
            case 1014:
                return 10.2f;
            case 1015:
                return 10.2f;
            case 1016:
                return 14.5f;
            case 1017:
                return 8.5f;
            case 1018:
                return 8.5f;
            case 1019:
                return 9f;
            case 1020:
                return 10f;
            case 1021:
                return 12.5f;
            default:
                return 0f;
        } 
    }
}
