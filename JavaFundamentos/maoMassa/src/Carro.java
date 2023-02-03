public class Carro {
    private String modelo;
    private Boolean racing;
    private int gasolina;


    public int gasolinaPus() {
        return this.gasolina += 20;
    }

    public String getModelo() {
        return modelo;
    }

    public Boolean getRacing() {
        return racing;
    }

    public int getGasolina() {
        return gasolina;
    }

    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }

    public void setRacing(Boolean racing) {
        this.racing = racing;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
