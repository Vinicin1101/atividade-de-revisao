public class App {
    public static void main(String[] args) throws Exception {
        
        // Instanciando Produtos
        Produto prod = new Produto(1, (1500.99), "Notebook da Posi");
        Produto prod2 = new Produto(2, (350.99), "Airfryer Polishop");

        // Instanciando um pedido de um item
        ItemPedido ItPedido = new ItemPedido(2, prod);
        ItemPedido ItPedido2 = new ItemPedido(4, prod2);

        // Instanciando um Pedido
        Pedido casasBahia = new Pedido();
        casasBahia.adicionarItem(ItPedido);
        casasBahia.adicionarItem(ItPedido2);

        casasBahia.obterPedido();
    }
}
