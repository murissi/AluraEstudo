public class Bolo extends Comida{
    public Bolo(double preco) {
        super(preco);
    }

    @Override
    public double comprar() {
        return super.preco *= 2;
    }

}
