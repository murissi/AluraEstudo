public class Cachorro extends Animal {
    private boolean domestica;
    private String nome;
    public Cachorro() {}

    public Cachorro(String nome) {
        this.nome = nome;
    }

    public void setDomestica(boolean domestica) {
        this.domestica = domestica;
    }

    public boolean getDomestica() {
        return this.domestica;
    }
    // sobrescrever
    public int getPatas() {
        return super.getPatas() + 1;
    }

    // sobrecarga
    public String getDomestico(boolean domestica) {
        if (domestica) {
            return "Isso é uma...";
        }
        return null;
    }

    public String getDomestico() {
        return "Sobrecarga";
    }



    // sobrescrever
    public String getNome() {
        return this.nome + super.getNome();
    }
}
