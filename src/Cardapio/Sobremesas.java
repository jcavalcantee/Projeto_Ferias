package Cardapio;

public class Sobremesas {

    private int id;
    private String nome;
    private float valor;
    
    public Sobremesas(int id, String nome, float valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    public static void CardapioSobremesas() {
        Sobremesas sorvete = new Sobremesas(1012, "Sorvete", 8.5f);
        Sobremesas brownie = new Sobremesas(1013, "Brownie", 9.5f);
        Sobremesas pudim = new Sobremesas(1014, "Pudim", 10.2f);
        Sobremesas milkshake = new Sobremesas(1015, "Milk-Shake", 10.2f);
        Sobremesas petitGateau = new Sobremesas(1016, "Petit Gâteau", 14.5f);
            sorvete.exibirSobremesas();
            brownie.exibirSobremesas();
            pudim.exibirSobremesas();
            milkshake.exibirSobremesas();
            petitGateau.exibirSobremesas();
    }

    public void exibirSobremesas() {
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
