import java.util.ArrayList;

public class Main {
     public static void main(String[] args) {
        ArrayList<Produto> carrinho = new ArrayList<Produto>();

        Mouse produto01 = new Mouse(
            "Loja01",
            320,
            "Mouse gamer, Saída USB. 5000 dpi",
            "Opitico"
            );
        Mouse produto02 = new Mouse(
            "Loja02",
            500,
            "Mouse ultra gamer, Saída USB, 15000",
            "Opitico"
            );
        Livro produto03 = new Livro(
            "Loja01",
            45,
            "Suma Teologica volume 1.",
            "Santo Tomás de Aquino"
            );
        Livro produto04 = new Livro(
            "Loja02",
            35,
            "Livro mini Hábitos - Como conseguir grandes resultados com pequenos esforços.",
            "Stephen Guise"
            );

        carrinho.add(produto01);
        carrinho.add(produto02);
        carrinho.add(produto03);
        carrinho.add(produto04);

        for (Produto pp : carrinho) {
            System.out.println(pp.getDescricao());
            System.out.println("");
        }
    }
}
