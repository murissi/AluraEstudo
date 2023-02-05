public class Salgado extends Comida{
    public Salgado(double preco) {
        super(preco);
    }

    @Override
    public double comprar() {
        return super.preco += 10;
    }
}
