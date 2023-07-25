package Cardapio;

public class Bebidas {

    private int id;
    private String nome;
    private float valor;
    
    public Bebidas(int id, String nome, float valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    public static void CardapioBebidas() {
        Bebidas aguaMineral = new Bebidas(1006, "Água Mineral", 5.f);
        Bebidas sucoNatural = new Bebidas(1007, "Suco Natural", 8f);
        Bebidas refriLata = new Bebidas(1008, "Refrigerante - Lata", 4.5f);
        Bebidas refri2L = new Bebidas(1009, "Refrigerante 2Lts", 12f);
        Bebidas cerveja = new Bebidas(1010, "Cerveja", 6f);
        Bebidas energetico = new Bebidas(1011, "Energético", 10f);
            aguaMineral.exibirBebidas();
            sucoNatural.exibirBebidas();
            refriLata.exibirBebidas();
            refri2L.exibirBebidas();
            cerveja.exibirBebidas();
            energetico.exibirBebidas();
    }

    public void exibirBebidas() {
        System.out.format("ID: %d\nProduto: %s\nValor: R$%.2f\n\n", id, nome, valor);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public float getValor() {
        return valor;
    }
}
