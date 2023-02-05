public abstract class Comida {
    protected double preco;
    private int peso;
    private String validade;

    public Comida(double preco) {
        this.preco = preco;
    }

    public abstract double comprar();


}
