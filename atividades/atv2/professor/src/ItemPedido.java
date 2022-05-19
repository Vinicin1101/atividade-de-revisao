public class ItemPedido {
    
    // Atributos
    private int quantidade;
    private Produto produto;

    // Construtor
    ItemPedido(int quantidade, Produto produto){
        this.produto = produto;
        this.quantidade = quantidade;
    }

    // Getters e Setters
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
