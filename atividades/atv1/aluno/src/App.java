public class App {
    public static void main(String[] args) throws Exception {
        
        // Instanciando um Livro
        Livro principe = new Livro();

        principe.setAno(2010);
        principe.setAutor("Nicolau Maquiavel");
        principe.setTitulo("O príncipe");
        
        // ou

        // Construtor com atributos
        Livro barca = new Livro("Auto da Barca do Inferno", "Gil Vicente", 2012);

        // Exibindo os atributo
        System.out.println("\nLivro: " + principe.getTitulo() + 
                            " de " + principe.getAutor() + 
                            " publicado em " + principe.getAno());

        System.out.println("\nLivro: " + barca.getTitulo() + 
                            " de " + barca.getAutor() + 
                            " publicado em " + barca.getAno());
    }
}
