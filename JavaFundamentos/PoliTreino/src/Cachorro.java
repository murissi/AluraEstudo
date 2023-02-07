public class Cachorro extends Animal {
    public Cachorro(int ano) {
        super(ano);
    }

    @Override
    public int nascimento() {

        return 2023 - super.idade ;
    }
}
