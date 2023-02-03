public class Animal {
    private int patas = 4;
    private boolean predador;

    public void cacado() {
        if(predador) {
            System.out.println("Animal caçado");
        }
    }

    public void setPredador(boolean predador) {
        this.predador = predador;
    }

    public boolean getPredador() {
        return this.predador;
    }
}
