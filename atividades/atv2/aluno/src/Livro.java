public class Livro{
  private String nome;
  private Autor autor;
  private double preco;
  private int qtd;
  
  public Livro(String nome, Autor autor, double preco, int qtd){
    
    this.nome = nome;
    this.autor = autor;
    this.preco = preco;
    this.qtd = qtd;
  }
  
  public String getNome(){
    return nome;
  }
  public Autor getAutor(){
    return autor;
  }
  public int getQtd(){
      return qtd;
  }
  public double getPreco(){
      return preco;
  }
  
  public void setNome(String nome){
    this.nome = nome;
  }
  public void setAutor(Autor autor){
    this.autor = autor;
  }
  public void setQtd(int qtd){
      this.qtd = qtd;
  }
  public void setPreco(double preco){
      this.preco = preco;
  }
  
  public String toString(){
    return ("Livro[NOME: " + this.getNome() + " AUTOR: " + this.getAutor().toString() + " PREÇO: " + this.getPreco() + " QTD: " + this.getQtd()) + "]";
  }
  
}
