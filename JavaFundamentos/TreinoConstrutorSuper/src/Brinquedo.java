public abstract class Brinquedo {

    private String nome;
    private double preco;
    private String marca;


    public Brinquedo(double preco, String marca) {
        this.marca = marca;
        this.preco = preco;
    }

    public abstract double comprar(); // obrigando todas classes filhas a terem metodo comprar


    public double getPreco() {
        return preco;
    }

    public String getMarca() {
        return marca;
    }
}

