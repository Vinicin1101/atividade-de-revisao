import java.util.ArrayList;

public class Pedido {
    
    // Atributos
    private ArrayList<ItemPedido> itens = new ArrayList<>();
    private float valor_total;

    // Construtor
    Pedido(){

    }
    

    public void adicionarItem(ItemPedido item) {
        // Adicionando o item no array
        itens.add(item);

        // Atualizando o valor total
        atualizarTotal();

        System.out.println("Item adicionado ao pedido!");
    }

    public void obterTotal() {
        System.out.println("\nValor total do pedido: " + valor_total);
    }

    public void obterPedido() {
        System.out.println("\nConteúdo do pedido:");
        System.out.println("Descrição   |   Valor   |   Quantidade");
        for (ItemPedido i : itens) {
            System.out.println(i.getProduto().getDesc() + "  |  R$" + i.getProduto().getValor() + "  |  " + i.getQuantidade());
        }

        obterTotal();
    }

    private void atualizarTotal() {
        if (!itens.isEmpty()) {
            for (ItemPedido i : itens) {
                valor_total += (i.getProduto().getValor() * i.getQuantidade());
            }
        } else{
            valor_total = 0;
        }
    }
}
