package Cardapio;

public class Porcoes {

    private int id;
    private String nome;
    private float valor;
    
    public Porcoes(int id, String nome, float valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    public static void CardapioPorcoes() {
        Porcoes batataFrita = new Porcoes(1017, "Batata-Frita", 8.5f); 
        Porcoes nuggets = new Porcoes(1018, "Nuggets", 8.5f);
        Porcoes onionRings = new Porcoes(1019, "Onion Rings", 9f);
        Porcoes calabresa = new Porcoes(1020,"Calabresa", 10f);
        Porcoes frango = new Porcoes(1021, "Frango a Passarinho", 12.5f);
            batataFrita.exibirPorcoes();
            nuggets.exibirPorcoes();
            onionRings.exibirPorcoes();
            calabresa.exibirPorcoes();
            frango.exibirPorcoes();      
    }

    public void exibirPorcoes() {
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
