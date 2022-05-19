public class Autor{
  private String nome, email;
  private char genero;
  
  public Autor(String nome, String email, char genero){
    
    this.nome = nome;
    this.email = email;
    this.genero = genero;
  }
  
  public String getNome(){
    return nome;
  }
  public String getEmail(){
    return email;
  }
  public char getGenero(){
      return genero;
  }
  
  public void setNome(String nome){
    this.nome = nome;
  }
  public void setAutor(String email){
    this.email = email;
  }
  public void setGenero(char genero){
      this.genero = genero;
  }
  
  public String toString(){
    return ("Autor[NOME: " + this.getNome() + " EMAIL: " + this.getEmail() + " GÊNERO: " + this.getGenero()) + "]";
  }
  
}