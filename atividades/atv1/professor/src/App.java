public class App {
    public static void main(String[] args) throws Exception {
        
        // Instanciando o objeto da classe Jogados
        Jogador p1 = new Jogador("Abner", 131.3, false);
        Jogador p2 = new Jogador();

        // Atribuindo valores ao objeto p1
        p1.setNome("Abner");
        p1.setAtivado(true);
        p1.setPontuacao(131.3);

        System.out.println("\nAtributos do jogador 1");
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Pontuação: " + p1.getPontuacao());
        System.out.println("Ativado: " + p1.isAtivado());

        System.out.println("\nAtributos do jogador 21");
        System.out.println("Nome: " + p2.getNome());
        System.out.println("Pontuação: " + p2.getPontuacao());
        System.out.println("Ativado: " + p2.isAtivado());
    }
}
