public class Produto {
    
    // Atributos do produto
    private int codigo;
    private double valor;
    private String desc;

    // Construtor
    Produto(int codigo, double d, String desc){
        this.codigo = codigo;
        this.valor = d;
        this.desc = desc;
    }

    // Getters e Setters
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
}
