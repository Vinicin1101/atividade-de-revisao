public class Main {
    public static void main(String[] args){
      String genero = "m";
      Autor autor = new Autor("Machado de Assis", "machadinho.ass@gmail.com", genero.charAt(0));
      
      Livro livro = new Livro("Topologia de rede de computadores", autor, 12.83, 2);
      
      String strAutor = autor.toString();
      String strLivro = livro.toString();

      System.out.println(strAutor + "\n" + strLivro);
    }
}
