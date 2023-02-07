public abstract class Animal {
    private String raca;
    protected int idade;
    private double peso;
    private String local;

    public  Animal(int idade) {
        this.idade = idade;
    }

    public abstract int nascimento();

}
