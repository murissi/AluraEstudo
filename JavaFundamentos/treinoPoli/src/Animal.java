public class Animal {
    private int patas = 4;
    private boolean cacador;

    public String  extincao() {
        if(cacador) {
            return "Safe Animal";
        } else {
            return "Animal Extinto";
        }
    }

    public void setCacador(boolean cacador) {
        this.cacador = cacador;
    }

    public int getPatas() {
        return patas;
    }

    public boolean getCacador() {
        return this.cacador;
    }

}
