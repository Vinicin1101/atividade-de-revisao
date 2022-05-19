// Classe Jogador
public class Jogador {
    
    // Atributos
    private double pontuacao;
    private String nome;
    private Boolean ativado;

    Jogador(){
        this(null, 0, false);
    }

    Jogador(String nome, double pontuacao, boolean ativado) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.ativado = ativado;
    }

    // Getters e Setters
    public double getPontuacao() {
        return pontuacao;
    }
    public void setPontuacao(double pontuacao) {
        this.pontuacao = pontuacao;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Boolean isAtivado() {
       if (ativado != null) {
            return ativado;
       } 

       return false;
    }
    public void setAtivado(Boolean ativado) {
        this.ativado = ativado;
    }


}
