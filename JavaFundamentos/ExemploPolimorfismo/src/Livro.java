public class Livro extends Produto {
    @Override
    public void mostraDados() {
        System.out.println("Dados do Livro!");;
    }

    public void mostraAutor() {
        System.out.println("Dados do autor!");
    }
}
