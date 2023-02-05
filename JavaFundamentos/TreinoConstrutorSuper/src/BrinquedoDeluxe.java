public class BrinquedoDeluxe extends Brinquedo{

    public BrinquedoDeluxe(double preco, String marca) {
        super(preco,marca);
    }

    @Override
    public double comprar() {
        return super.getPreco() + 40;
    }

        
}
