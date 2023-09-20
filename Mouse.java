public class Mouse extends Produto {
    private String tipo;

    Mouse(String nomeloja, double preco, String descricao, String tipo) {
        super(nomeloja, preco, descricao);
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        String newDescricao = super.getDescricao() + "\nTipo: " + getTipo();
        return newDescricao;
    }
}
