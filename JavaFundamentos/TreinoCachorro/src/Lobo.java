public class Lobo {

    private String cor;
    private String sexo;
    private boolean bravo;
    private static int alcateia;

    public Lobo(String cor, String sexo, boolean bravo) {
        alcateia++;
        this.cor = cor;
        this.sexo = sexo;
        this.bravo = bravo;
    }

    public String getCor() {
        return cor;
    }

    public static int getAlcateia() {
        return alcateia;
    }

    public String getSexo() {
        return sexo;
    }
}
