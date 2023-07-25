package Cardapio;

public class Lanches {

    private int id;
    private String nome;
    private float valor;

    public Lanches(int id, String nome, float valor) { 
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }
    
    public static void CardapioLanches() {
        Lanches xBuguer = new Lanches(1000, "X-Burguer", 12.5f);
        Lanches xSalada = new Lanches(1001, "X-Salada", 14.5f);
        Lanches xEgg = new Lanches(1002, "X-Egg", 15f);
        Lanches xBacon = new Lanches(1003, "X-Bacon", 16f);
        Lanches xTudo = new Lanches(1004, "X-Tudo", 21.5f);
        Lanches hotDog = new Lanches(1005, "Hot-Dog", 10f);
            xBuguer.exibirLanches();
            xSalada.exibirLanches();
            xEgg.exibirLanches();
            xBacon.exibirLanches();
            xTudo.exibirLanches();
            hotDog.exibirLanches();
    }

     public void exibirLanches() {
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
