public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.mostraDados();

        // --------------

        Produto p2 = new Livro(); // tem polimorfismo
        p2.mostraDados();

        // -----------
        Livro l1 = new Livro(); // nao tem polimorfismo
        l1.mostraAutor();
        l1.mostraDados();


        //------------------

        Livro l2 = (Livro) l1;
        l2.mostraDados();
        l2.mostraAutor();

        Produto p3 = new Revista();
        p3.mostraDados();
    }
}