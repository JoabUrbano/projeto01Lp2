public class Livro extends Produto{
    private String autor;

    Livro(String nomeloja, double preco, String descricao, String autor) {
        super(nomeloja, preco, descricao);
        this.autor = autor;
    }

    public String getAutor() {
        return this.autor;
    }
    public void setAutor() {
        this.autor = autor;
    }

    public String getDescricao() {
        String newDescricao = super.getDescricao() + "\nTipo: " + getAutor();
        return newDescricao;
    }
}
