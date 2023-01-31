public class Carro {

    private boolean freio;
    private int marcha;
    private boolean startCar;
    private boolean acelerar;
    private Piloto piloto;
    private static int carros;


    public Carro(boolean freio, boolean startCar) {
        Carro.carros ++;
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


    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public static int getCarros() {
        return Carro.carros;
    }
}
