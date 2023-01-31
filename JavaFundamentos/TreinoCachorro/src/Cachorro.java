public class Cachorro extends Lobo {

    private String raca;

    public Cachorro(String cor, String sexo, boolean bravo) {
        super(cor, sexo, bravo);
    }

    public String latir() {
        return "AU AU AU!!";
    }

}
