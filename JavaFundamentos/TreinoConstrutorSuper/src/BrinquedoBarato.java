public class BrinquedoBarato extends Brinquedo{
    public BrinquedoBarato(double preco, String marca) {
        super(preco, marca);
    }

    @Override
    public double comprar() {
        return super.getPreco();
    }
}
