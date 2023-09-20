public class Produto{
    private String nomeLoja;
    private double preco;
    private String descricao;

    Produto(String nomeLoja, double preco, String descricao) {
        this.nomeLoja = nomeLoja;
        this.preco = preco;
        this.descricao = descricao;
    }

    public String getNomeLoja() {
        return this.nomeLoja;
    }
    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public double getPreco() {
        return this.preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return "Produto de informática";
    }
}