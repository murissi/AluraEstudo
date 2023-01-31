public class Carro {

    private boolean freio;
    private int marcha;
    private boolean startCar;
    private boolean acelerar;
    private Piloto piloto;


    public Carro(boolean freio, boolean startCar) {
        if (!freio) {
            System.out.println("Solta o freio");
        }
        if (startCar) {
            System.out.println("Carro ligado!");
        }
        this.freio = freio;
        this.startCar = startCar;
    }

    public Carro(int marcha, boolean freio, boolean startCar) {
        this(freio,startCar);
        this.marcha = marcha;
    }
}
